package ch.qos.logback.classic.spi;

import java.net.URL;
import java.security.CodeSource;
import java.util.HashMap;
import org.apache.commons.io.IOUtils;

/* JADX INFO: loaded from: classes7.dex */
public class PackagingDataCalculator {
    static final StackTraceElementProxy[] STEP_ARRAY_TEMPLATE = new StackTraceElementProxy[0];
    HashMap<String, ClassPackagingData> cache = new HashMap<>();

    private Class<?> bestEffortLoadClass(ClassLoader classLoader, String str) {
        Class<?> clsLoadClass = loadClass(classLoader, str);
        if (clsLoadClass != null) {
            return clsLoadClass;
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != classLoader) {
            clsLoadClass = loadClass(contextClassLoader, str);
        }
        if (clsLoadClass != null) {
            return clsLoadClass;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return null;
        } catch (Exception e4) {
            e4.printStackTrace();
            return null;
        }
    }

    private ClassPackagingData computeBySTEP(StackTraceElementProxy stackTraceElementProxy, ClassLoader classLoader) {
        String className = stackTraceElementProxy.ste.getClassName();
        ClassPackagingData classPackagingData = this.cache.get(className);
        if (classPackagingData != null) {
            return classPackagingData;
        }
        Class<?> clsBestEffortLoadClass = bestEffortLoadClass(classLoader, className);
        ClassPackagingData classPackagingData2 = new ClassPackagingData(getCodeLocation(clsBestEffortLoadClass), getImplementationVersion(clsBestEffortLoadClass), false);
        this.cache.put(className, classPackagingData2);
        return classPackagingData2;
    }

    private String getCodeLocation(Class<?> cls) {
        URL location;
        if (cls == null) {
            return "na";
        }
        try {
            CodeSource codeSource = cls.getProtectionDomain().getCodeSource();
            if (codeSource == null || (location = codeSource.getLocation()) == null) {
                return "na";
            }
            String string = location.toString();
            String codeLocation = getCodeLocation(string, IOUtils.DIR_SEPARATOR_UNIX);
            return codeLocation != null ? codeLocation : getCodeLocation(string, '\\');
        } catch (Exception unused) {
            return "na";
        }
    }

    private String getImplementationVersion(Class<?> cls) {
        Package r14;
        String implementationVersion;
        return (cls == null || (r14 = cls.getPackage()) == null || (implementationVersion = r14.getImplementationVersion()) == null) ? "na" : implementationVersion;
    }

    private boolean isFolder(int i14, String str) {
        return i14 != -1 && i14 + 1 == str.length();
    }

    private Class<?> loadClass(ClassLoader classLoader, String str) {
        if (classLoader == null) {
            return null;
        }
        try {
            return classLoader.loadClass(str);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return null;
        } catch (Exception e4) {
            e4.printStackTrace();
            return null;
        }
    }

    private void populateFrames(StackTraceElementProxy[] stackTraceElementProxyArr) {
        int iFindNumberOfCommonFrames = STEUtil.findNumberOfCommonFrames(new Throwable("local stack reference").getStackTrace(), stackTraceElementProxyArr);
        int length = stackTraceElementProxyArr.length - iFindNumberOfCommonFrames;
        for (int i14 = 0; i14 < iFindNumberOfCommonFrames; i14++) {
            StackTraceElementProxy stackTraceElementProxy = stackTraceElementProxyArr[length + i14];
            stackTraceElementProxy.setClassPackagingData(computeBySTEP(stackTraceElementProxy, null));
        }
        populateUncommonFrames(iFindNumberOfCommonFrames, stackTraceElementProxyArr, null);
    }

    private void populateUncommonFrames(int i14, StackTraceElementProxy[] stackTraceElementProxyArr, ClassLoader classLoader) {
        int length = stackTraceElementProxyArr.length - i14;
        for (int i15 = 0; i15 < length; i15++) {
            StackTraceElementProxy stackTraceElementProxy = stackTraceElementProxyArr[i15];
            stackTraceElementProxy.setClassPackagingData(computeBySTEP(stackTraceElementProxy, classLoader));
        }
    }

    public void calculate(IThrowableProxy iThrowableProxy) {
        while (iThrowableProxy != null) {
            populateFrames(iThrowableProxy.getStackTraceElementProxyArray());
            IThrowableProxy[] suppressed = iThrowableProxy.getSuppressed();
            if (suppressed != null) {
                for (IThrowableProxy iThrowableProxy2 : suppressed) {
                    populateFrames(iThrowableProxy2.getStackTraceElementProxyArray());
                }
            }
            iThrowableProxy = iThrowableProxy.getCause();
        }
    }

    private String getCodeLocation(String str, char c14) {
        int iLastIndexOf = str.lastIndexOf(c14);
        if (isFolder(iLastIndexOf, str)) {
            return str.substring(str.lastIndexOf(c14, iLastIndexOf - 1) + 1);
        }
        if (iLastIndexOf > 0) {
            return str.substring(iLastIndexOf + 1);
        }
        return null;
    }
}
