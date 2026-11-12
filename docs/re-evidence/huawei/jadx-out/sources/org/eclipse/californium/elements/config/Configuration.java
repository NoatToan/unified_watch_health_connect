package org.eclipse.californium.elements.config;

import defpackage.aaex;
import defpackage.zxv;
import defpackage.zyt;
import defpackage.zyw;
import defpackage.zyy;
import defpackage.zzp;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public final class Configuration {
    private static Configuration d;
    private final Map<String, String> f;
    private final Map<String, Object> g;
    private final zxv<DocumentedDefinition<?>> h;
    private final ConcurrentMap<String, DefinitionsProvider> i;
    private final Set<String> j;
    public static final File e = new File("Californium3.properties");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f44464a = aaex.a((Class<?>) Configuration.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentMap<String, DefinitionsProvider> f44465b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final zxv<DocumentedDefinition<?>> f44466c = new zxv<>("Configuration");

    public interface DefinitionsProvider {
        void applyDefinitions(Configuration configuration);
    }

    public interface ModuleDefinitionsProvider extends DefinitionsProvider {
        String getModule();
    }

    private static boolean c(ConcurrentMap<String, DefinitionsProvider> concurrentMap, ModuleDefinitionsProvider moduleDefinitionsProvider) {
        if (concurrentMap == null) {
            throw new NullPointerException("Modules must not be null!");
        }
        if (moduleDefinitionsProvider == null) {
            throw new NullPointerException("DefinitionsProvider must not be null!");
        }
        String module = moduleDefinitionsProvider.getModule();
        if (module == null) {
            throw new IllegalArgumentException("DefinitionsProvider's module must not be null!");
        }
        if (module.isEmpty()) {
            throw new IllegalArgumentException("DefinitionsProvider's module name must not be empty!");
        }
        DefinitionsProvider definitionsProviderPutIfAbsent = concurrentMap.putIfAbsent(module, moduleDefinitionsProvider);
        if (definitionsProviderPutIfAbsent == null || definitionsProviderPutIfAbsent == moduleDefinitionsProvider) {
            return definitionsProviderPutIfAbsent == null;
        }
        throw new IllegalArgumentException("Module " + module + " already registered with different provider!");
    }

    public static void e(ModuleDefinitionsProvider moduleDefinitionsProvider) {
        if (c(f44465b, moduleDefinitionsProvider)) {
            f44464a.info("defaults added {}", moduleDefinitionsProvider.getModule());
        }
    }

    public static Configuration e() {
        synchronized (Configuration.class) {
            if (d == null) {
                b(e);
            }
        }
        return d;
    }

    public static Configuration b(File file) {
        Configuration configurationB = b(file, "Californium3 CoAP Properties file", (DefinitionsProvider) null);
        d = configurationB;
        return configurationB;
    }

    public static Configuration b(File file, String str, DefinitionsProvider definitionsProvider) {
        if (file == null) {
            throw new NullPointerException("file must not be null!");
        }
        Configuration configuration = new Configuration();
        configuration.e(definitionsProvider);
        if (file.exists()) {
            configuration.a(file);
            return configuration;
        }
        configuration.d(file, str);
        return configuration;
    }

    public Configuration() {
        this.g = new HashMap();
        this.j = new HashSet();
        this.f = new HashMap();
        this.h = f44466c;
        this.i = f44465b;
        d();
    }

    public Configuration(Configuration configuration) {
        HashMap map = new HashMap();
        this.g = map;
        HashSet hashSet = new HashSet();
        this.j = hashSet;
        this.f = new HashMap();
        zxv<DocumentedDefinition<?>> zxvVar = f44466c;
        zxv<DocumentedDefinition<?>> zxvVar2 = configuration.h;
        this.h = zxvVar != zxvVar2 ? new zxv<>(zxvVar2) : zxvVar;
        ConcurrentMap<String, DefinitionsProvider> concurrentMap = f44465b;
        this.i = concurrentMap != configuration.i ? new ConcurrentHashMap<>(configuration.i) : concurrentMap;
        hashSet.addAll(configuration.j);
        map.putAll(configuration.g);
    }

    private void d() {
        Iterator<DefinitionsProvider> it = this.i.values().iterator();
        while (it.hasNext()) {
            it.next().applyDefinitions(this);
        }
    }

    private void e(DefinitionsProvider definitionsProvider) {
        if (definitionsProvider != null) {
            HashSet hashSet = new HashSet(this.i.keySet());
            definitionsProvider.applyDefinitions(this);
            if (hashSet.size() < this.i.size()) {
                Set<String> setKeySet = this.i.keySet();
                setKeySet.removeAll(hashSet);
                for (String str : setKeySet) {
                    f44464a.warn("Add missing module {}", str);
                    this.i.get(str).applyDefinitions(this);
                }
                definitionsProvider.applyDefinitions(this);
            }
        }
    }

    public void a(File file) {
        if (file == null) {
            throw new NullPointerException("file must not be null");
        }
        f44464a.info("loading properties from file {}", file.getAbsolutePath());
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                c(fileInputStream);
                fileInputStream.close();
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e2) {
            f44464a.warn("cannot load properties from file {}: {}", file.getAbsolutePath(), e2.getMessage());
        }
    }

    public void c(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            throw new NullPointerException("input stream must not be null");
        }
        Properties properties = new Properties();
        properties.load(inputStream);
        a(properties);
    }

    public void a(Properties properties) {
        if (properties == null) {
            throw new NullPointerException("properties must not be null!");
        }
        if (this.h.b()) {
            throw new IllegalStateException("Configuration contains no definitions!");
        }
        for (Object obj : properties.keySet()) {
            if (obj instanceof String) {
                String str = (String) obj;
                DocumentedDefinition<?> documentedDefinition = (DocumentedDefinition) this.h.d(str);
                if (documentedDefinition == null) {
                    f44464a.warn("Ignore {}, no configuration definition available!", str);
                } else if (e(str)) {
                    this.g.put(str, a(documentedDefinition, properties.getProperty(str)));
                }
            }
        }
    }

    private boolean e(String str) {
        if (this.j.contains(str)) {
            f44464a.warn("Ignore {}, definition set transient!", str);
            return false;
        }
        if (this.f.containsKey(str)) {
            String str2 = this.f.get(str);
            if (str2 != null) {
                f44464a.warn("Deprecated {}, please replace it by {}!", str, str2);
                return true;
            }
            f44464a.warn("Deprecated {}, please remove it!", str);
            return true;
        }
        f44464a.debug("Load {}", str);
        return true;
    }

    private Object a(DocumentedDefinition<?> documentedDefinition, String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return null;
        }
        try {
            return documentedDefinition.readValue(strTrim);
        } catch (RuntimeException e2) {
            f44464a.warn("{}", e2.getMessage());
            return null;
        }
    }

    public void d(File file, String str) {
        if (file == null) {
            throw new NullPointerException("file must not be null");
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                b(fileOutputStream, str, file.getAbsolutePath());
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e2) {
            f44464a.warn("cannot write properties to {}: {}", file.getAbsolutePath(), e2.getMessage());
        }
    }

    public void b(OutputStream outputStream, String str, String str2) {
        if (outputStream == null) {
            throw new NullPointerException("output stream must not be null!");
        }
        if (str == null) {
            throw new NullPointerException("header must not be null!");
        }
        if (str2 != null) {
            f44464a.info("writing properties to {}", str2);
        }
        if (this.g.isEmpty()) {
            throw new IllegalStateException("Configuration contains no values!");
        }
        try {
            Set<String> setKeySet = this.i.keySet();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (String str3 : this.g.keySet()) {
                if (!this.j.contains(str3) && !this.f.containsKey(str3)) {
                    Iterator<String> it = setKeySet.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (str3.startsWith(it.next())) {
                                arrayList2.add(str3);
                                break;
                            }
                        } else {
                            arrayList.add(str3);
                            break;
                        }
                    }
                }
            }
            Collections.sort(arrayList);
            Collections.sort(arrayList2);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
            try {
                outputStreamWriter.write(zyt.c(str));
                outputStreamWriter.write(zzp.c());
                outputStreamWriter.write(zyt.c(new Date().toString()));
                outputStreamWriter.write(zzp.c());
                outputStreamWriter.write("#");
                outputStreamWriter.write(zzp.c());
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    b((String) it2.next(), outputStreamWriter);
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    b((String) it3.next(), outputStreamWriter);
                }
                outputStreamWriter.close();
            } catch (Throwable th) {
                try {
                    outputStreamWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e2) {
            if (str2 != null) {
                f44464a.warn("cannot write properties to {}: {}", str2, e2.getMessage());
            } else {
                f44464a.warn("cannot write properties: {}", e2.getMessage());
            }
        }
    }

    private void b(String str, Writer writer) throws IOException {
        String strWrite;
        DocumentedDefinition documentedDefinition = (DocumentedDefinition) this.h.d(str);
        if (documentedDefinition == null) {
            throw new IllegalArgumentException("Definition for " + str + " not found!");
        }
        StringBuilder sb = new StringBuilder();
        String documentation = documentedDefinition.getDocumentation();
        if (documentation != null) {
            sb.append(documentation);
        }
        Object defaultValue = documentedDefinition.getDefaultValue();
        if (defaultValue != null && (strWrite = documentedDefinition.write(defaultValue)) != null) {
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append("Default: ");
            sb.append(strWrite);
        }
        if (sb.length() > 0) {
            writer.write(zyt.c(sb.toString()));
            writer.write(zzp.c());
        }
        writer.write(zyt.e(str, true));
        writer.write(61);
        Object obj = this.g.get(str);
        if (obj != null) {
            writer.write(zyt.e(documentedDefinition.write(obj), false));
        }
        writer.write(zzp.c());
    }

    public <T> Configuration a(DocumentedDefinition<T> documentedDefinition, DocumentedDefinition<T> documentedDefinition2) {
        if (documentedDefinition == null) {
            throw new NullPointerException("Deprecated definition must not be null!");
        }
        this.f.put(documentedDefinition.getKey(), documentedDefinition2 == null ? null : documentedDefinition2.getKey());
        d(documentedDefinition, null, null);
        return this;
    }

    public <T> boolean e(DocumentedDefinition<T> documentedDefinition) {
        if (documentedDefinition != null) {
            return this.h.d(documentedDefinition.getKey()) != null;
        }
        throw new NullPointerException("definition must not be null");
    }

    public <T> Configuration e(BasicDefinition<T> basicDefinition, T t) {
        d(basicDefinition, t, null);
        return this;
    }

    public <T> Configuration e(BasicListDefinition<T> basicListDefinition, T... tArr) {
        if (tArr == null) {
            throw new NullPointerException("Values must not be null!");
        }
        d(basicListDefinition, Arrays.asList(tArr), null);
        return this;
    }

    public <T> T c(BasicDefinition<T> basicDefinition) {
        return (T) b(basicDefinition);
    }

    public Configuration c(zyy zyyVar, Long l, TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new NullPointerException("unit must not be null");
        }
        if (l != null) {
            l = Long.valueOf(TimeUnit.NANOSECONDS.convert(l.longValue(), timeUnit));
        }
        d(zyyVar, l, null);
        return this;
    }

    public Configuration a(zyy zyyVar, int i, TimeUnit timeUnit) {
        return c(zyyVar, Long.valueOf(i), timeUnit);
    }

    public Long e(zyy zyyVar, TimeUnit timeUnit) {
        Long l = (Long) b(zyyVar);
        if (timeUnit != null) {
            return l != null ? Long.valueOf(timeUnit.convert(l.longValue(), TimeUnit.NANOSECONDS)) : l;
        }
        throw new NullPointerException("unit must not be null");
    }

    public int d(zyy zyyVar, TimeUnit timeUnit) {
        Long lE = e(zyyVar, timeUnit);
        if (lE == null) {
            return 0;
        }
        if (lE.longValue() > 2147483647L) {
            throw new IllegalArgumentException(lE + " doesn't fit to int (Max. 2147483647)!");
        }
        if (lE.longValue() < -2147483648L) {
            throw new IllegalArgumentException(lE + " doesn't fit to int (Min. -2147483648)!");
        }
        return lE.intValue();
    }

    private <T> T b(DocumentedDefinition<T> documentedDefinition) {
        if (documentedDefinition == null) {
            throw new NullPointerException("definition must not be null");
        }
        DocumentedDefinition<T> documentedDefinition2 = (DocumentedDefinition) this.h.d(documentedDefinition.getKey());
        if (documentedDefinition2 != null && documentedDefinition2 != documentedDefinition) {
            throw new IllegalArgumentException("Definition " + documentedDefinition + " doesn't match " + documentedDefinition2);
        }
        T t = (T) this.g.get(documentedDefinition.getKey());
        return t == null ? documentedDefinition.getDefaultValue() : t;
    }

    private <T> void d(DocumentedDefinition<T> documentedDefinition, T t, String str) {
        T tCheckValue;
        if (documentedDefinition == null) {
            throw new NullPointerException("definition must not be null");
        }
        DocumentedDefinition<T> documentedDefinition2 = (DocumentedDefinition) this.h.d(documentedDefinition);
        if (documentedDefinition2 != null && documentedDefinition2 != documentedDefinition) {
            throw new IllegalArgumentException("Definition " + documentedDefinition + " doesn't match " + documentedDefinition2);
        }
        if (t == null && str != null) {
            tCheckValue = documentedDefinition.readValue(str);
        } else {
            if (t != null && !documentedDefinition.isAssignableFrom(t)) {
                throw new IllegalArgumentException(t.getClass().getSimpleName() + " is not a " + documentedDefinition.getTypeName());
            }
            try {
                tCheckValue = documentedDefinition.checkValue(t);
            } catch (zyw e2) {
                throw new IllegalArgumentException(e2.getMessage());
            }
        }
        this.g.put(documentedDefinition.getKey(), tCheckValue);
    }
}
