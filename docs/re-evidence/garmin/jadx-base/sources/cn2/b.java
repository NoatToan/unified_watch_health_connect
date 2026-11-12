package cn2;

import an2.l;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.LongSparseArray;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import o13.m;
import o13.t;
import o53.a0;
import o53.c0;
import o53.s0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import p13.i0;
import p13.l0;
import p13.u;
import t13.g;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcn2/b;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lan2/a;", "sharedDeviceManager", "Lan2/a$e;", "config", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "<init>", "(Landroid/content/Context;Lan2/a;Lan2/a$e;Ljava/lang/String;)V", "a", "shared-device-management_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b extends BroadcastReceiver {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Set<String> f28070i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f28071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final an2.a f28072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final an2.a.e f28073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f28074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f28075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u53.d f28076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LongSparseArray<Long> f28077g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f28078h;

    /* JADX INFO: renamed from: cn2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C0432b extends w implements e23.a<Logger> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0432b f28079a = new C0432b();

        public C0432b() {
            super(0);
        }

        @Override // e23.a
        public final Logger invoke() {
            l.f4589a.getClass();
            return LoggerFactory.getLogger("DM#".concat("OtherAppBroadcastReceiver"));
        }
    }

    static {
        new a(null);
        f28070i = u.m0(new String[]{"com.garmin.device.sharing.management.ACTION_NEW_DEVICE_PAIRED", "com.garmin.device.sharing.management.ACTION_DEVICE_REMOVED"});
    }

    public b(Context context, an2.a aVar, an2.a.e eVar, String str) {
        context.getClass();
        aVar.getClass();
        eVar.getClass();
        this.f28071a = context;
        this.f28072b = aVar;
        this.f28073c = eVar;
        this.f28074d = str;
        this.f28075e = m.b(C0432b.f28079a);
        this.f28076f = c0.a(g.a.C3052a.d(new a0("DM#Receiver"), ge1.b.h()));
        this.f28077g = new LongSparseArray<>();
    }

    public final Logger a() {
        return (Logger) this.f28075e.getValue();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Long lValueOf = intent != null ? Long.valueOf(intent.getLongExtra("com.garmin.device.sharing.management.EXTRA_UNIT_ID", -1L)) : null;
        if (lValueOf != null) {
            long jLongValue = 0;
            if (lValueOf.longValue() <= 0) {
                return;
            }
            String stringExtra = intent.getStringExtra("com.garmin.device.sharing.management.EXTRA_SOURCE_PACKAGE");
            String action = intent.getAction();
            if (action != null && action.hashCode() == -1090758120 && action.equals("com.garmin.device.sharing.management.ACTION_DEVICE_REMOVED")) {
                if (s.g(context != null ? context.getPackageName() : null, stringExtra)) {
                    a().debug("dropping " + lValueOf + " from knownDevices list triggered by [" + stringExtra + "]");
                    an2.a aVar = this.f28072b;
                    synchronized (aVar.f4496c) {
                        try {
                            if (aVar.f4496c.remove(lValueOf) != null) {
                                an2.a.d.a(an2.a.f4492e).debug("removed the device from knownDevices list");
                            }
                            Unit unit = Unit.INSTANCE;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            if (!this.f28073c.b().contains(cn2.a.f28067e)) {
                Collection<cn2.a> collectionB = this.f28073c.b();
                if (!(collectionB instanceof Collection) || !collectionB.isEmpty()) {
                    Iterator<T> it = collectionB.iterator();
                    do {
                        if (it.hasNext()) {
                        }
                    } while (!s.g(((cn2.a) it.next()).f28069a, stringExtra));
                }
                a().debug(e0.g("ignoring ", intent.getAction(), " from unregistered app [", stringExtra, "]"));
                return;
            }
            l0 l0Var = this.f28073c.f4516h;
            if (l0Var == null) {
                l0Var.getClass();
                i0.f134941a.getClass();
            }
            int intExtra = intent.getIntExtra("com.garmin.device.sharing.management.EXTRA_PRODUCT_NUMBER", 0);
            String strValueOf = intExtra > 0 ? String.valueOf(intExtra) : "";
            String action2 = intent.getAction();
            if (action2 != null) {
                int iHashCode = action2.hashCode();
                if (iHashCode != -1090758120) {
                    if (iHashCode == 440990754 && action2.equals("com.garmin.device.sharing.management.ACTION_NEW_DEVICE_PAIRED")) {
                        a().debug("ACTION_NEW_DEVICE_PAIRED");
                        long jLongValue2 = lValueOf.longValue();
                        boolean z14 = !s.g(stringExtra, context != null ? context.getPackageName() : null);
                        an2.a.e eVar = this.f28073c;
                        if (strValueOf.length() != 0) {
                            an2.a.d dVar = an2.a.f4492e;
                            Collection<String> collection = eVar.f4510b;
                            dVar.getClass();
                            if (an2.a.d.b(strValueOf, collection)) {
                                eVar.g(jLongValue2, strValueOf, z14);
                                return;
                            }
                        }
                        a().trace("ignoring onNewDeviceAdded for product number [" + strValueOf + "]");
                        return;
                    }
                    return;
                }
                if (action2.equals("com.garmin.device.sharing.management.ACTION_DEVICE_REMOVED")) {
                    synchronized (this.f28077g) {
                        Long l14 = this.f28077g.get(lValueOf.longValue());
                        if (l14 != null) {
                            jLongValue = l14.longValue();
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (jLongValue + ((long) 2000) > jCurrentTimeMillis) {
                            a().trace("ignoring duplicate broadcast " + intent.getAction() + " for [" + lValueOf + "]");
                            return;
                        }
                        this.f28077g.put(lValueOf.longValue(), Long.valueOf(jCurrentTimeMillis));
                        Unit unit2 = Unit.INSTANCE;
                        a().debug("ACTION_DEVICE_REMOVED");
                        long jLongValue3 = lValueOf.longValue();
                        boolean z15 = !s.g(stringExtra, this.f28074d);
                        if (strValueOf.length() > 0) {
                            an2.a.d dVar2 = an2.a.f4492e;
                            Collection<String> collection2 = this.f28073c.f4510b;
                            dVar2.getClass();
                            if (!an2.a.d.b(strValueOf, collection2)) {
                                a().trace("ignoring ACTION_DEVICE_REMOVED for product number [" + strValueOf + "] from broadcast");
                                return;
                            }
                        }
                        u53.d dVar3 = this.f28076f;
                        x53.c cVar = s0.f129406a;
                        ge1.b.T(dVar3, x53.b.f189152a, null, new c(this, z15, jLongValue3, strValueOf, null), 2);
                    }
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcn2/b$a;", "", "<init>", "()V", "", "DUPLICATE_REMOVE_DELAY", "I", "", "", "SUPPORTED_BROADCASTS", "Ljava/util/Set;", "shared-device-management_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ b(Context context, an2.a aVar, an2.a.e eVar, String str, int i14, j jVar) {
        this(context, aVar, eVar, (i14 & 8) != 0 ? context.getPackageName() : str);
    }
}
