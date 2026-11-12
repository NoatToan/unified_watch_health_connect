package sn;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import com.caverock.androidsvg.SVGParseException;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.e0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.notifications.model.NotificationItem;
import com.github.mikephil.charting.formatter.IFillFormatter;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import f12.l;
import gl1.y;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.xml.sax.Attributes;
import p005kotlin.jvm.internal.s;
import p3.m;
import p3.o0;
import sz0.i0;
import sz0.o;
import sz0.u;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements IFillFormatter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160365a;

    public static void A(u4.e eVar, float f14, float f15, float f16, float f17) {
        eVar.i(f14, f15);
        eVar.g(f16);
        eVar.o(f17);
    }

    public static void B(u4.e eVar, float f14, float f15, float f16, float f17) {
        eVar.o(f14);
        eVar.g(f15);
        eVar.i(f16, f17);
    }

    public static int a(Attributes attributes, int i14) {
        return tj.i.g.a(attributes.getLocalName(i14)).ordinal();
    }

    public static long b(m mVar) {
        return d92.b.a(mVar).f().d();
    }

    public static long c(o0 o0Var) {
        return d92.b.a(o0Var).j().c();
    }

    public static Intent d(Context context, Context context2, Class cls) {
        context.getClass();
        return new Intent(context2, (Class<?>) cls);
    }

    public static String e(int i14, String str, String str2, String str3) {
        return str + i14 + str2 + str3;
    }

    public static String f(Double d14, Double d15, String str, String str2, StringBuilder sb3) {
        sb3.append(d14);
        sb3.append(str);
        sb3.append(d15);
        sb3.append(str2);
        return sb3.toString();
    }

    public static String g(String str) {
        Locale locale = Locale.getDefault();
        locale.getClass();
        String upperCase = str.toUpperCase(locale);
        upperCase.getClass();
        return upperCase;
    }

    public static String h(m mVar, int i14, int i15, m mVar2) {
        mVar.C(i14);
        String strQ = y.Q(mVar2, i15);
        mVar.f();
        return strQ;
    }

    public static StringBuilder i(String str, String str2) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(str2);
        return sb3;
    }

    public static u4.e j(float f14, float f15, float f16, float f17, float f18) {
        u4.e eVar = new u4.e();
        eVar.k(f14, f15);
        eVar.i(f16, f17);
        eVar.g(f18);
        return eVar;
    }

    public static /* synthetic */ void k(int i14, String str) {
        throw new IllegalStateException((str + i14).toString());
    }

    public static /* synthetic */ void l(int i14, String str, Object obj) {
        throw new IllegalArgumentException(str + i14 + obj);
    }

    public static void m(Parcel parcel, int i14, Double d14) {
        parcel.writeInt(i14);
        parcel.writeDouble(d14.doubleValue());
    }

    public static void n(Parcel parcel, int i14, Long l14) {
        parcel.writeInt(i14);
        parcel.writeLong(l14.longValue());
    }

    public static void o(l.a aVar, boolean z14) {
        aVar.getClass();
        l.a.a().T3(z14);
    }

    public static void p(Double d14, Double d15, String str, String str2, StringBuilder sb3) {
        sb3.append(str);
        sb3.append(d14);
        sb3.append(str2);
        sb3.append(d15);
    }

    public static /* synthetic */ void q(String str) throws SVGParseException {
        throw new SVGParseException(str);
    }

    public static /* synthetic */ void r(String str, Object obj, Throwable th3) {
        throw new SecurityException(str + obj, th3);
    }

    public static void s(String str, String str2, i2.a aVar, a2 a2Var, String str3) {
        aVar.getClass();
        i2.a.f(a2Var, str3, str + str2);
    }

    public static void t(StringBuilder sb3, String str, String str2, String str3, String str4) {
        sb3.append(str);
        sb3.append(str2);
        sb3.append(str3);
        sb3.append(str4);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00f9  */
    public static void u(u uVar, i0 i0Var) {
        NotificationItem.Request requestD;
        Context contextRequireContext = uVar.requireContext();
        contextRequireContext.getClass();
        i0Var.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "NotificationViewModel", "updateViewedState ");
        wz0.a aVar2 = i0Var.f161422j;
        List<NotificationItem> list = aVar2.f188130b;
        List<NotificationItem> list2 = aVar2.f188130b;
        List<NotificationItem> list3 = aVar2.f188129a;
        Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> map = aVar2.f188131c;
        int size = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size) {
                break;
            }
            NotificationItem notificationItem = list2.get(i14);
            if (notificationItem instanceof NotificationItem.Activity) {
                NotificationItem.Activity activity = (NotificationItem.Activity) notificationItem;
                if (s.g(activity.getNotificationFullItemDTO().getViewed(), Boolean.FALSE)) {
                    Long lD = activity.getNotificationFullItemDTO().getFromUserId();
                    NotificationItem.Activity activityC = o.c(activity.getNotificationFullItemDTO(), contextRequireContext, Boolean.TRUE, map.get(lD != null ? Integer.valueOf((int) lD.longValue()) : null));
                    if (activityC != null) {
                        list2.set(i14, activityC);
                    }
                }
            }
            i14++;
        }
        if (list3.size() - 1 <= 2) {
            int size2 = list3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                NotificationItem notificationItem2 = list3.get(i15);
                if (notificationItem2 instanceof NotificationItem.Request) {
                    NotificationItem.Request request = (NotificationItem.Request) notificationItem2;
                    if (s.g(request.getViewState().f39558g, Boolean.FALSE)) {
                        if (request.getRequestNotificationDTO() != null) {
                            Long lK = request.getRequestNotificationDTO().getUserId();
                            requestD = o.g(request.getRequestNotificationDTO(), contextRequireContext, Boolean.TRUE, map.get(lK != null ? Integer.valueOf((int) lK.longValue()) : null));
                        } else if (request.getInboxGroupInviteRequestDTO() != null) {
                            vz0.b requestKey = request.getRequestKey();
                            if (requestKey != null) {
                                Long lO = request.getInboxGroupInviteRequestDTO().getUserProfileId();
                                requestD = o.f(request.getInboxGroupInviteRequestDTO(), contextRequireContext, requestKey, Boolean.TRUE, map.get(lO != null ? Integer.valueOf((int) lO.longValue()) : null));
                            } else {
                                requestD = null;
                            }
                        } else if (request.getDeviceInviteDTO() != null) {
                            Long lI = request.getDeviceInviteDTO().getInviteeID();
                            requestD = o.d(request.getDeviceInviteDTO(), contextRequireContext, Boolean.TRUE, map.get(lI != null ? Integer.valueOf((int) lI.longValue()) : null));
                        } else {
                            requestD = null;
                        }
                        if (requestD != null) {
                            list3.set(i15, requestD);
                        }
                    }
                }
            }
        }
        if (!aVar2.f188135g) {
            aVar2.f188134f = true;
        }
        e0.b.a aVar3 = i0Var.f34755a;
        if (aVar3 != null) {
            aVar3.a(true);
        }
    }

    public static void v(u4.e eVar, float f14, float f15) {
        eVar.g(f14);
        eVar.o(f15);
        eVar.c();
    }

    public static void w(u4.e eVar, float f14, float f15, float f16) {
        eVar.i(f14, f15);
        eVar.o(f16);
        eVar.c();
    }

    public static void x(u4.e eVar, float f14, float f15, float f16, float f17) {
        eVar.g(f14);
        eVar.i(f15, f16);
        eVar.o(f17);
    }

    public static long y(o0 o0Var) {
        return d92.b.a(o0Var).f().d();
    }

    public static /* synthetic */ void z(int i14, String str) {
        throw new IllegalArgumentException(str + i14);
    }

    @Override // com.github.mikephil.charting.formatter.IFillFormatter
    public float getFillLinePosition(ILineDataSet iLineDataSet, LineDataProvider lineDataProvider) {
        switch (this.f160365a) {
            case 4:
                int i14 = sp1.b.f160508b;
                return 0.0f;
            default:
                int i15 = tl1.c.f165274e;
                return -10.0f;
        }
    }
}
