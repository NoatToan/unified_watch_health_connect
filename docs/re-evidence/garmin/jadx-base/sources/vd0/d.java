package vd0;

import android.graphics.RectF;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.annual_report.developer_option.MultipleImagesShareSampleActivity;
import com.garmin.android.apps.connectmobile.navigation.more.MoreActivity;
import com.garmin.android.apps.connectmobile.navigation.more.TestSearchActivity;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l72.i3;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f177192b;

    public /* synthetic */ d(p3.p1 p1Var, int i14) {
        this.f177191a = i14;
        this.f177192b = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f177191a;
        int i15 = 0;
        p3.p1 p1Var = this.f177192b;
        switch (i14) {
            case 0:
                String str = (String) obj;
                str.getClass();
                StringBuilder sb3 = new StringBuilder();
                int length = str.length();
                while (i15 < length) {
                    char cCharAt = str.charAt(i15);
                    if (Character.isDigit(cCharAt)) {
                        sb3.append(cCharAt);
                    }
                    i15++;
                }
                p1Var.setValue(sb3.toString());
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                p1Var.setValue(bool);
                break;
            case 2:
                p1Var.setValue((g2) g2.f177273e.get(((Integer) obj).intValue()));
                break;
            case 3:
                Uri uri = (Uri) obj;
                uri.getClass();
                p1Var.setValue(uri);
                break;
            case 4:
                List list = (List) obj;
                list.getClass();
                Uri uri2 = (Uri) p13.h0.d0(list);
                if (uri2 != null) {
                    p1Var.setValue(uri2);
                }
                break;
            case 5:
                String str2 = (String) obj;
                str2.getClass();
                StringBuilder sb4 = new StringBuilder();
                int length2 = str2.length();
                while (i15 < length2) {
                    char cCharAt2 = str2.charAt(i15);
                    if (Character.isDigit(cCharAt2)) {
                        sb4.append(cCharAt2);
                    }
                    i15++;
                }
                p1Var.setValue(sb4.toString());
                break;
            case 6:
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                if (p005kotlin.jvm.internal.s.g(i3Var.f111063a, "MENU_SEARCH")) {
                    p1Var.setValue(Boolean.TRUE);
                }
                break;
            case 7:
                i3 i3Var2 = (i3) obj;
                i3Var2.getClass();
                if (p005kotlin.jvm.internal.s.g(i3Var2.f111063a, "MENU_SEARCH")) {
                    p1Var.setValue(Boolean.TRUE);
                }
                break;
            case 8:
                ((Boolean) obj).getClass();
                p1Var.setValue(Boolean.valueOf(!((Boolean) p1Var.getF182175a()).booleanValue()));
                break;
            case 9:
                p1Var.setValue(Boolean.valueOf(!((Boolean) obj).booleanValue()));
                break;
            case 10:
                String str3 = (String) obj;
                int i16 = MultipleImagesShareSampleActivity.f30169a;
                str3.getClass();
                p1Var.setValue(str3);
                break;
            case 11:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                int i17 = MoreActivity.f39378g;
                p1Var.setValue(bool2);
                break;
            case 12:
                Boolean bool3 = (Boolean) obj;
                bool3.getClass();
                int i18 = MoreActivity.f39378g;
                p1Var.setValue(bool3);
                break;
            case 13:
                Boolean bool4 = (Boolean) obj;
                bool4.getClass();
                int i19 = TestSearchActivity.f39390b;
                p1Var.setValue(bool4);
                break;
            case 14:
                Boolean bool5 = (Boolean) obj;
                bool5.getClass();
                int i24 = TestSearchActivity.f39390b;
                p1Var.setValue(bool5);
                break;
            case 15:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                p1Var.setValue(bool6);
                break;
            case 16:
                RectF rectF = (RectF) obj;
                rectF.getClass();
                p1Var.setValue(rectF);
                break;
            case 17:
                ((f.a) obj).getClass();
                p1Var.setValue(Boolean.TRUE);
                break;
            case 18:
                p1Var.setValue((w51.d1) w51.d1.f182250d.get(((Integer) obj).intValue()));
                break;
            case 19:
                m4.g0 g0Var = (m4.g0) obj;
                g0Var.getClass();
                p1Var.setValue(Boolean.valueOf(g0Var.b()));
                break;
            case 20:
                c80.s0 s0Var = (c80.s0) obj;
                s0Var.getClass();
                LinkedHashMap linkedHashMapN = p13.u0.n((Map) p1Var.getF182175a());
                Object obj2 = linkedHashMapN.get(s0Var);
                obj2.getClass();
                linkedHashMapN.put(s0Var, Boolean.valueOf(!((Boolean) obj2).booleanValue()));
                p1Var.setValue(linkedHashMapN);
                break;
            case 21:
                String str4 = (String) obj;
                str4.getClass();
                p1Var.setValue(str4);
                break;
            case 22:
                m4.g0 g0Var2 = (m4.g0) obj;
                g0Var2.getClass();
                p1Var.setValue(Boolean.valueOf(g0Var2.a()));
                break;
            case 23:
                String str5 = (String) obj;
                str5.getClass();
                p1Var.setValue(str5);
                break;
            case 24:
                x5.l0 l0Var = (x5.l0) obj;
                l0Var.getClass();
                p1Var.setValue(l0Var);
                break;
            case 25:
                j70.r rVar = (j70.r) obj;
                rVar.getClass();
                p1Var.setValue(rVar);
                break;
            case 26:
                p1Var.setValue(Boolean.FALSE);
                break;
            case 27:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                p1Var.setValue(bool7);
                break;
            case 28:
                p1Var.setValue((n4.c) obj);
                break;
            default:
                p1Var.setValue(Boolean.valueOf(!((Boolean) obj).booleanValue()));
                break;
        }
        return Unit.INSTANCE;
    }
}
