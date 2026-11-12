package org.apache.commons.lang3;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.arch.Processor;

/* JADX INFO: loaded from: classes23.dex */
public class ArchUtils {
    private static final Map<String, Processor> a = new HashMap();

    static {
        c();
    }

    private static void a(String str, Processor processor) throws IllegalStateException {
        Map<String, Processor> map = a;
        if (!map.containsKey(str)) {
            map.put(str, processor);
            return;
        }
        throw new IllegalStateException("Key " + str + " already exists in processor map");
    }

    private static void b(Processor processor, String... strArr) throws IllegalStateException {
        for (String str : strArr) {
            a(str, processor);
        }
    }

    private static void c() {
        h();
        i();
        d();
        e();
        f();
        g();
    }

    private static void d() {
        b(new Processor(Processor.Arch.BIT_32, Processor.Type.IA_64), "ia64_32", "ia64n");
    }

    private static void e() {
        b(new Processor(Processor.Arch.BIT_64, Processor.Type.IA_64), "ia64", "ia64w");
    }

    private static void f() {
        b(new Processor(Processor.Arch.BIT_32, Processor.Type.PPC), "ppc", "power", "powerpc", "power_pc", "power_rs");
    }

    private static void g() {
        b(new Processor(Processor.Arch.BIT_64, Processor.Type.PPC), "ppc64", "power64", "powerpc64", "power_pc64", "power_rs64");
    }

    public static Processor getProcessor() {
        return getProcessor(SystemUtils.OS_ARCH);
    }

    private static void h() {
        b(new Processor(Processor.Arch.BIT_32, Processor.Type.X86), "x86", "i386", "i486", "i586", "i686", "pentium");
    }

    private static void i() {
        b(new Processor(Processor.Arch.BIT_64, Processor.Type.X86), "x86_64", "amd64", "em64t", "universal");
    }

    public static Processor getProcessor(String str) {
        return a.get(str);
    }
}
