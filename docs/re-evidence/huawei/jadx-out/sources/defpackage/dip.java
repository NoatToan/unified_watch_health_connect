package defpackage;

import com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy;
import java.util.HashMap;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes7.dex */
public class dip {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap<Integer, Supplier<JumpDeviceStrategy>> f31819b;

    static {
        HashMap<Integer, Supplier<JumpDeviceStrategy>> map = new HashMap<>();
        f31819b = map;
        map.put(1, new Supplier() { // from class: dis
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dig();
            }
        });
        map.put(2, new Supplier() { // from class: djg
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dht();
            }
        });
        map.put(3, new Supplier() { // from class: div
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dhi();
            }
        });
        map.put(4, new Supplier() { // from class: dja
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dgn();
            }
        });
        map.put(5, new Supplier() { // from class: djc
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dii();
            }
        });
        map.put(6, new Supplier() { // from class: diz
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dgv();
            }
        });
        map.put(7, new Supplier() { // from class: djd
            @Override // java.util.function.Supplier
            public final Object get() {
                return new die();
            }
        });
        map.put(8, new Supplier() { // from class: djb
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dhu();
            }
        });
        map.put(9, new Supplier() { // from class: djh
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dgp();
            }
        });
        map.put(10, new Supplier() { // from class: dje
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dil();
            }
        });
        map.put(11, new Supplier() { // from class: dix
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dhf();
            }
        });
        map.put(12, new Supplier() { // from class: dji
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dgw();
            }
        });
        map.put(15, new Supplier() { // from class: djf
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dhp();
            }
        });
        map.put(16, new Supplier() { // from class: djm
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dhx();
            }
        });
        map.put(19, new Supplier() { // from class: djj
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dhz();
            }
        });
        map.put(21, new Supplier() { // from class: djl
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dgo();
            }
        });
        map.put(22, new Supplier() { // from class: djn
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dib();
            }
        });
        map.put(28, new Supplier() { // from class: djk
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dgz();
            }
        });
        map.put(29, new Supplier() { // from class: djr
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dhg();
            }
        });
        map.put(30, new Supplier() { // from class: diy
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dit();
            }
        });
        map.put(39, new Supplier() { // from class: djs
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dhq();
            }
        });
        map.put(41, new Supplier() { // from class: djp
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dhd();
            }
        });
        map.put(52, new Supplier() { // from class: djo
            @Override // java.util.function.Supplier
            public final Object get() {
                return new did();
            }
        });
        map.put(53, new Supplier() { // from class: djq
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dgy();
            }
        });
        map.put(59, new Supplier() { // from class: djv
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dhk();
            }
        });
        map.put(60, new Supplier() { // from class: dju
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dhj();
            }
        });
        map.put(67, new Supplier() { // from class: djw
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dio();
            }
        });
        map.put(68, new Supplier() { // from class: diu
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dih();
            }
        });
        map.put(69, new Supplier() { // from class: diw
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dho();
            }
        });
    }

    public static JumpDeviceStrategy a(int i) {
        Supplier<JumpDeviceStrategy> supplier = f31819b.get(Integer.valueOf(i));
        if (supplier == null) {
            return null;
        }
        return supplier.get();
    }
}
