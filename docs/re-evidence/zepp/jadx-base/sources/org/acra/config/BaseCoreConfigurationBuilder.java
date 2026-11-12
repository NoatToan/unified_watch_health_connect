package org.acra.config;

import android.content.Context;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.acra.ACRA;
import org.acra.ACRAConstants;
import org.acra.ReportField;
import org.acra.config.BaseCoreConfigurationBuilder;
import org.acra.plugins.PluginLoader;
import org.acra.plugins.ServicePluginLoader;
import org.acra.util.StubCreator;

/* JADX INFO: loaded from: classes23.dex */
public final class BaseCoreConfigurationBuilder {
    private final Context b;
    private List<ConfigurationBuilder> c;
    private List<Configuration> d;
    private final Map<ReportField, Boolean> a = new EnumMap(ReportField.class);
    private PluginLoader e = new ServicePluginLoader();

    public BaseCoreConfigurationBuilder(@NonNull Context context) {
        this.b = context;
    }

    private List<ConfigurationBuilder> b() {
        if (this.c == null) {
            List listLoad = this.e.load(ConfigurationBuilderFactory.class);
            if (ACRA.DEV_LOGGING) {
                ACRA.log.d(ACRA.LOG_TAG, "Found ConfigurationBuilderFactories : " + listLoad);
            }
            this.c = new ArrayList(listLoad.size());
            Iterator it2 = listLoad.iterator();
            while (it2.hasNext()) {
                this.c.add(((ConfigurationBuilderFactory) it2.next()).create(this.b));
            }
        }
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object c(Object obj, Method method, Object[] objArr) throws Throwable {
        return obj;
    }

    @NonNull
    public List<Configuration> d() {
        return this.d;
    }

    @NonNull
    public PluginLoader e() {
        return this.e;
    }

    public void f() throws ACRAConfigurationException {
        this.d = new ArrayList();
        List<ConfigurationBuilder> listB = b();
        if (ACRA.DEV_LOGGING) {
            ACRA.log.d(ACRA.LOG_TAG, "Found ConfigurationBuilders : " + listB);
        }
        Iterator<ConfigurationBuilder> it2 = listB.iterator();
        while (it2.hasNext()) {
            this.d.add(it2.next().build());
        }
    }

    @NonNull
    public Set<ReportField> g(@NonNull ReportField[] reportFieldArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (reportFieldArr.length != 0) {
            if (ACRA.DEV_LOGGING) {
                ACRA.log.d(ACRA.LOG_TAG, "Using custom Report Fields");
            }
            linkedHashSet.addAll(Arrays.asList(reportFieldArr));
        } else {
            if (ACRA.DEV_LOGGING) {
                ACRA.log.d(ACRA.LOG_TAG, "Using default Report Fields");
            }
            linkedHashSet.addAll(Arrays.asList(ACRAConstants.DEFAULT_REPORT_FIELDS));
        }
        for (Map.Entry<ReportField, Boolean> entry : this.a.entrySet()) {
            if (entry.getValue().booleanValue()) {
                linkedHashSet.add(entry.getKey());
            } else {
                linkedHashSet.remove(entry.getKey());
            }
        }
        return linkedHashSet;
    }

    @NonNull
    public <R extends ConfigurationBuilder> R getPluginConfigurationBuilder(@NonNull Class<R> cls) {
        Iterator<ConfigurationBuilder> it2 = b().iterator();
        while (it2.hasNext()) {
            R r = (R) it2.next();
            if (cls.isAssignableFrom(r.getClass())) {
                return r;
            }
        }
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("Class " + cls.getName() + " is not a registered ConfigurationBuilder");
        }
        ACRA.log.w(ACRA.LOG_TAG, "Couldn't find ConfigurationBuilder " + cls.getSimpleName() + ". ALL CALLS TO IT WILL BE IGNORED!");
        return (R) StubCreator.createStub(cls, new InvocationHandler() { // from class: qp
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                return BaseCoreConfigurationBuilder.c(obj, method, objArr);
            }
        });
    }

    public void setPluginLoader(@NonNull PluginLoader pluginLoader) {
        this.e = pluginLoader;
    }

    public void setReportField(@NonNull ReportField reportField, boolean z) {
        this.a.put(reportField, Boolean.valueOf(z));
    }
}
