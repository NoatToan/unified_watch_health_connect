package al;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.accessibility.AccessibilityManager;
import ch.qos.logback.core.CoreConstants;
import com.garmin.analytics.firebase.eventValidators.FirebaseEventValidator;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import o13.m;
import o13.n;
import o13.q;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import vb.h;
import zk.e;
import zk.f;
import zk.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lal/b;", "Lzk/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "analytics-firebase_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<g> f3714d;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3715a;

        static {
            int[] iArr = new int[yy2.b.a.values().length];
            try {
                iArr[yy2.b.a.LargeTextEnabled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yy2.b.a.LargeTextDisabled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[yy2.b.a.VoiceOverEnabled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[yy2.b.a.VoiceOverDisabled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[yy2.b.a.HighContrastEnabled.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[yy2.b.a.HighContrastDisabled.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[yy2.b.a.BoldTextEnabled.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[yy2.b.a.BoldTextDisabled.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[yy2.b.a.ReduceMotionEnabled.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[yy2.b.a.ReduceMotionDisabled.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f3715a = iArr;
        }
    }

    /* JADX INFO: renamed from: al.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C0063b extends w implements e23.a<FirebaseAnalytics> {
        public C0063b() {
            super(0);
        }

        @Override // e23.a
        public final FirebaseAnalytics invoke() {
            return FirebaseAnalytics.getInstance(b.this.f3711a.getApplicationContext());
        }
    }

    public b(Context context) {
        context.getClass();
        this.f3711a = context;
        this.f3712b = m.a(n.PUBLICATION, new C0063b());
        this.f3713c = "FIREBASE";
        this.f3714d = p13.w.c(new FirebaseEventValidator());
    }

    @Override // zk.f
    public final List<g> a() {
        return this.f3714d;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00d0  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, o13.l] */
    @Override // zk.f
    public final void b(zk.a aVar) {
        yy2.b.a aVar2;
        Object bVar;
        aVar.getClass();
        String str = aVar.f205029a;
        yy2.b.a[] aVarArrValues = yy2.b.a.values();
        ArrayList arrayList = new ArrayList(aVarArrValues.length);
        boolean z14 = false;
        for (yy2.b.a aVar3 : aVarArrValues) {
            arrayList.add(aVar3.f200211a);
        }
        if (!arrayList.contains(str)) {
            FirebaseAnalytics firebaseAnalytics = (FirebaseAnalytics) this.f3712b.getValue();
            List<e> list = aVar.f205030b;
            list.getClass();
            Bundle bundle = new Bundle();
            for (e eVar : list) {
                String str2 = eVar.f205040a;
                Object obj = eVar.f205041b;
                if (obj instanceof Boolean) {
                    bundle.putBoolean(str2, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Double) {
                    bundle.putDouble(str2, ((Number) obj).doubleValue());
                } else if (obj instanceof Integer) {
                    bundle.putInt(str2, ((Number) obj).intValue());
                } else if (obj instanceof Long) {
                    bundle.putLong(str2, ((Number) obj).longValue());
                } else {
                    if (!(obj instanceof String)) {
                        h.z(p6.b.e("Unsupported parameter type: ", s0.f105811a.b(obj.getClass())));
                        return;
                    }
                    bundle.putString(str2, (String) obj);
                }
            }
            firebaseAnalytics.logEvent(str, bundle);
            return;
        }
        yy2.b.a[] aVarArrValues2 = yy2.b.a.values();
        int length = aVarArrValues2.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                aVar2 = null;
                break;
            }
            aVar2 = aVarArrValues2[i14];
            if (s.g(str, aVar2.f200211a)) {
                break;
            } else {
                i14++;
            }
        }
        if (aVar2 == null) {
            return;
        }
        int i15 = a.f3715a[aVar2.ordinal()];
        float f14 = 1.0f;
        Context context = this.f3711a;
        switch (i15) {
            case 1:
            case 2:
                al.a.f3710a.getClass();
                float f15 = context.getResources().getConfiguration().fontScale;
                yy2.b.EnumC3747b.f200212b.getClass();
                yy2.b.EnumC3747b enumC3747bA = yy2.b.EnumC3747b.a.a(f15);
                FirebaseAnalytics.getInstance(context).setUserProperty("LargeTextEnabled", String.valueOf(f15 > 1.0f));
                FirebaseAnalytics.getInstance(context).setUserProperty("LargeTextSize", enumC3747bA.f200223a);
                break;
            case 3:
            case 4:
                al.a.f3710a.getClass();
                FirebaseAnalytics firebaseAnalytics2 = FirebaseAnalytics.getInstance(context);
                Object systemService = context.getSystemService("accessibility");
                AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
                if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                    List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
                    enabledAccessibilityServiceList.getClass();
                    if (!enabledAccessibilityServiceList.isEmpty()) {
                        z14 = true;
                    }
                }
                firebaseAnalytics2.setUserProperty("VoiceOverEnabled", String.valueOf(z14));
                break;
            case 5:
            case 6:
                al.a.f3710a.getClass();
                FirebaseAnalytics firebaseAnalytics3 = FirebaseAnalytics.getInstance(context);
                try {
                    int i16 = q.f128596b;
                    Object systemService2 = context.getSystemService("accessibility");
                    AccessibilityManager accessibilityManager2 = systemService2 instanceof AccessibilityManager ? (AccessibilityManager) systemService2 : null;
                    if (accessibilityManager2 != null) {
                        Object objInvoke = accessibilityManager2.getClass().getMethod("isHighTextContrastEnabled", null).invoke(accessibilityManager2, null);
                        if (objInvoke instanceof Boolean) {
                            bVar = (Boolean) objInvoke;
                        } else {
                            bVar = null;
                        }
                    } else {
                        bVar = null;
                    }
                } catch (Throwable th3) {
                    int i17 = q.f128596b;
                    bVar = new q.b(th3);
                }
                Throwable thB = q.b(bVar);
                if (thB != null) {
                    thB.printStackTrace();
                }
                Boolean bool = (Boolean) (bVar instanceof q.b ? null : bVar);
                firebaseAnalytics3.setUserProperty("HighContrastEnabled", String.valueOf(bool != null ? bool.booleanValue() : false));
                break;
            case 7:
            case 8:
                al.a.f3710a.getClass();
                FirebaseAnalytics firebaseAnalytics4 = FirebaseAnalytics.getInstance(context);
                if (Build.VERSION.SDK_INT >= 31 && context.getResources().getConfiguration().fontWeightAdjustment > 0) {
                    z14 = true;
                }
                firebaseAnalytics4.setUserProperty("BoldTextEnabled", String.valueOf(z14));
                break;
            case 9:
            case 10:
                al.a.f3710a.getClass();
                FirebaseAnalytics firebaseAnalytics5 = FirebaseAnalytics.getInstance(context);
                try {
                    f14 = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale");
                    break;
                } catch (Exception unused) {
                }
                firebaseAnalytics5.setUserProperty("ReduceMotionEnabled", String.valueOf(f14 == 0.0f));
                break;
        }
    }

    @Override // zk.f
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF3713c() {
        return this.f3713c;
    }
}
