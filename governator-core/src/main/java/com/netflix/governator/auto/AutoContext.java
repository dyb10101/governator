package com.netflix.governator.auto;

import com.google.inject.Key;

/**
 * Context for the auto module to provide context to any Condition
 * 
 * @author elandau
 *
 */
public interface AutoContext { 
    /**
     * @param className
     * @return Return true if the module was installed
     */
    boolean hasModule(String className);
    
    /**
     * @param profile
     * @return Return true if profile was set
     */
    boolean hasProfile(String profile);
    
    /**
     * @param key
     * @return Return true if a binding exists for a key
     */
    boolean hasBinding(Key<?> key);
}
