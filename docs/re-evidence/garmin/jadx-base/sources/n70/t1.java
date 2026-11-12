package n70;

import com.garmin.android.gncs.NotificationConstants;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln70/t1;", "Ln70/v;", "Lj70/p;", "Lj70/n;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Lj70/n;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t1 implements v<j70.p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j70.n f124579a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f124580a;

        static {
            int[] iArr = new int[j70.n.values().length];
            try {
                iArr[j70.n.ACTIVE_CALORIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j70.n.BODY_BATTERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j70.n.PUSHES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j70.n.STEPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[j70.n.STRESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f124580a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"n70/t1$b", "Lcom/google/gson/reflect/TypeToken;", "Lj70/m;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends TypeToken<j70.m> {
    }

    public t1(j70.n nVar) {
        nVar.getClass();
        this.f124579a = nVar;
    }

    public final j70.p b(String... strArr) {
        Map linkedHashMap;
        String string;
        j70.m mVar = (j70.m) a((String) p13.u.L(0, strArr), new b());
        int i14 = a.f124580a[this.f124579a.ordinal()];
        if (i14 == 1) {
            if (mVar != null) {
                return new j70.p.a(j70.o.a(mVar.get_activeCalories()));
            }
            p13.k0 k0Var = p13.k0.f134949a;
            k0Var.getClass();
            return new j70.p.a(k0Var);
        }
        if (i14 != 2) {
            if (i14 == 3) {
                if (mVar != null) {
                    return new j70.p.a(j70.o.a(mVar.get_pushes()));
                }
                p13.k0 k0Var2 = p13.k0.f134949a;
                k0Var2.getClass();
                return new j70.p.a(k0Var2);
            }
            if (i14 == 4) {
                if (mVar != null) {
                    return new j70.p.a(j70.o.a(mVar.get_steps()));
                }
                p13.k0 k0Var3 = p13.k0.f134949a;
                k0Var3.getClass();
                return new j70.p.a(k0Var3);
            }
            if (i14 != 5) {
                lc.u0.r();
                return null;
            }
            if (mVar != null) {
                return new j70.p.a(j70.o.a(mVar.get_stress()));
            }
            p13.k0 k0Var4 = p13.k0.f134949a;
            k0Var4.getClass();
            return new j70.p.a(k0Var4);
        }
        if (mVar == null) {
            p13.k0 k0Var5 = p13.k0.f134949a;
            k0Var5.getClass();
            return new j70.p.b(k0Var5);
        }
        j70.l lVar = mVar.get_bodyBattery();
        if (lVar != null) {
            p13.k0 k0Var6 = p13.k0.f134949a;
            k0Var6.getClass();
            linkedHashMap = new LinkedHashMap(k0Var6);
            List<String> listB = lVar.b();
            List<List<Object>> listA = lVar.a();
            if (listB != null && listA != null) {
                ArrayList arrayListZ = p13.h0.Z(listA);
                ArrayList<List> arrayList = new ArrayList();
                for (Object obj : arrayListZ) {
                    if (((List) obj).size() == listB.size()) {
                        arrayList.add(obj);
                    }
                }
                for (List list : arrayList) {
                    Object objE0 = p13.h0.e0(0, list);
                    if (objE0 != null) {
                        String string2 = objE0.toString();
                        Object objE1 = p13.h0.e0(1, list);
                        Double dValueOf = (objE1 == null || (string = objE1.toString()) == null) ? null : Double.valueOf(Double.parseDouble(string));
                        Object objE2 = p13.h0.e0(2, list);
                        linkedHashMap.put(string2, new o13.p(dValueOf, objE2 != null ? objE2.toString() : null));
                    }
                }
            }
        } else {
            linkedHashMap = p13.k0.f134949a;
            linkedHashMap.getClass();
        }
        return new j70.p.b(linkedHashMap);
    }

    @Override // n70.v
    public final String getTag() {
        return "GetEpochDataUseCase - " + this.f124579a;
    }
}
