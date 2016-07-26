package io.anyway.galaxy.extension;

/**
 * ExtensionFactory
 * 
 * @author william.liangf
 * @export
 */
public interface ExtensionFactory {

    /**
     * Get extension.
     * 
     * @param type object type.
     * @param name object name.
     * @return object instance.
     */
    <T> T getExtension(Class<T> type, String name);

}
