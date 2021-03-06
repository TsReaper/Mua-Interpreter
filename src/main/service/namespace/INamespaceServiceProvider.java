package service.namespace;

import lang.element.MuaElement;
import lang.namespace.Namespace;

import java.util.ArrayList;

public interface INamespaceServiceProvider {
    void addNamespace(Namespace parent);

    MuaElement removeNamespace();

    Namespace getNamespaceByKey(String key);

    MuaElement getBoundedElement(String key);

    ArrayList<String> getKeys();

    ArrayList<String> getAllNamespaceKeys();

    void bindElement(String key, MuaElement element);

    boolean eraseBoundedElement(String key);

    void eraseAll();

    boolean isName(String key);

    void setReturnValue(MuaElement element);

    boolean isGlobal();

    void export();
}
