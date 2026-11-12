package org.junit.runner;

import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.junit.internal.Classes;
import org.junit.runner.manipulation.Filter;

/* JADX INFO: loaded from: classes23.dex */
class a {
    public static Filter a(Class<? extends FilterFactory> cls, FilterFactoryParams filterFactoryParams) throws FilterFactory.FilterNotCreatedException {
        return c(cls).createFilter(filterFactoryParams);
    }

    public static Filter b(String str, FilterFactoryParams filterFactoryParams) throws FilterFactory.FilterNotCreatedException {
        return d(str).createFilter(filterFactoryParams);
    }

    public static FilterFactory c(Class<? extends FilterFactory> cls) throws FilterFactory.FilterNotCreatedException {
        try {
            return cls.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            throw new FilterFactory.FilterNotCreatedException(e);
        }
    }

    public static FilterFactory d(String str) throws FilterFactory.FilterNotCreatedException {
        try {
            return c(Classes.getClass(str).asSubclass(FilterFactory.class));
        } catch (Exception e) {
            throw new FilterFactory.FilterNotCreatedException(e);
        }
    }

    public static Filter e(Request request, String str) throws FilterFactory.FilterNotCreatedException {
        Description description = request.getRunner().getDescription();
        String[] strArrSplit = str.contains(SearchCriteria.EQ) ? str.split(SearchCriteria.EQ, 2) : new String[]{str, ""};
        return b(strArrSplit[0], new FilterFactoryParams(description, strArrSplit[1]));
    }
}
