package gy0;

import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.Util;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lgy0/a1;", "", "Lby0/a;", "dataSource", "<init>", "(Lby0/a;)V", "a", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final by0.a f80099a;

    static {
        new a(null);
    }

    public a1(by0.a aVar) {
        aVar.getClass();
        this.f80099a = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x006e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x006e -> B:22:0x006f). Please report as a decompilation issue!!! */
    public final Object a(String str, oy0.i iVar, String str2, v13.c cVar) {
        b1 b1Var;
        String str3;
        oy0.i iVar2;
        String str4;
        List list;
        b1 b1Var2;
        int i14;
        int i15;
        if (cVar instanceof b1) {
            b1Var = (b1) cVar;
            int i16 = b1Var.f80112h;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                b1Var.f80112h = i16 - Integer.MIN_VALUE;
            } else {
                b1Var = new b1(this, cVar);
            }
        } else {
            b1Var = new b1(this, cVar);
        }
        Object objO = b1Var.f80110f;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = b1Var.f80112h;
        if (i17 == 0) {
            ArrayList arrayListX = v.h.x(objO);
            if (str2 == null) {
                str2 = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName();
            }
            str3 = str;
            iVar2 = iVar;
            str4 = str2;
            list = arrayListX;
            b1Var2 = b1Var;
            i14 = 0;
            b1Var2.f80105a = str3;
            b1Var2.f80106b = iVar2;
            b1Var2.f80107c = list;
            b1Var2.f80108d = str4;
            b1Var2.f80109e = i14;
            b1Var2.f80112h = 1;
            objO = this.f80099a.o(str3, str4, i14, 1000, iVar2, b1Var2);
            if (objO == aVar) {
                return aVar;
            }
            i15 = i14;
        } else {
            if (i17 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i15 = b1Var.f80109e;
            String str5 = b1Var.f80108d;
            list = b1Var.f80107c;
            oy0.i iVar3 = b1Var.f80106b;
            String str6 = b1Var.f80105a;
            o13.r.b(objO);
            str4 = str5;
            b1Var2 = b1Var;
            iVar2 = iVar3;
            str3 = str6;
        }
        List list2 = (List) objO;
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
        String strH = com.airbnb.lottie.animation.keyframe.a.h("GetMultiDayActivityTimelineSummariesUseCase - Result summaries isEmpty?:", list2.isEmpty());
        i2.f36769a.getClass();
        i2.a.a(a2Var, strH);
        if (!list2.isEmpty() || list.size() == list2.size()) {
            return Util.toImmutableList(list);
        }
        list.addAll(list2);
        i14 = i15 + 1000;
        b1Var2.f80105a = str3;
        b1Var2.f80106b = iVar2;
        b1Var2.f80107c = list;
        b1Var2.f80108d = str4;
        b1Var2.f80109e = i14;
        b1Var2.f80112h = 1;
        objO = this.f80099a.o(str3, str4, i14, 1000, iVar2, b1Var2);
        if (objO == aVar) {
            return aVar;
        }
        i15 = i14;
        List list3 = (List) objO;
        com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
        String strH2 = com.airbnb.lottie.animation.keyframe.a.h("GetMultiDayActivityTimelineSummariesUseCase - Result summaries isEmpty?:", list3.isEmpty());
        i2.f36769a.getClass();
        i2.a.a(a2Var2, strH2);
        if (list3.isEmpty()) {
        }
        return Util.toImmutableList(list);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgy0/a1$a;", "", "<init>", "()V", "", "TIMELINE_SUMMARY_PAGE_SIZE", "I", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
