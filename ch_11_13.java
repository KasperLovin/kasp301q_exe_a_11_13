import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ch_11_13
{
    /*Write a method isUnique that accepts a map whose keys and values are strings as a parameter and returns
    true if no two keys map to the same value (and false if any two or more keys do map to the same value).
    For example, if the map contains the following key/value pairs, your method would return true:
    {Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins}.
    But calling it on the following map would return false,because of two mappings for Perkins and Reges:
    {Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges, Hal=Perkins}*/

    public static void main(String[] args)
    {
        Map<String,String> uniqueMap = new TreeMap<>();
        uniqueMap.put("Kasper","Lovin");
        uniqueMap.put("Lukas","Nielsen");
        uniqueMap.put("Matias","Gramkow");
        uniqueMap.put("Andreas", "Jepsen");

        System.out.println(isUnique(uniqueMap));

    }

    public static boolean isUnique (Map<String,String>tempMap)
    {
        Set<String>tempSet = new HashSet<>();

        for (String name : tempMap.keySet())
        {
            String value = tempMap.get(name);
            if (tempSet.contains(value))
            {
                return false;
            }
            else
            {
               tempSet.add(value);
            }
        }
        return true;
    }
}
