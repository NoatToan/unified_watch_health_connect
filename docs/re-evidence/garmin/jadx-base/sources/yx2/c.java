package yx2;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.y1;
import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import u62.z;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$%BÓ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u000e¢\u0006\u0004\b\u001c\u0010\u001dBñ\u0001\b\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u000e\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001c\u0010\"¨\u0006&"}, d2 = {"Lyx2/c;", "Landroid/os/Parcelable;", "", "subscriptionPartNumber", "", "isTrial", "isActiveOnServer", "source", "expirationString", "activationString", "packageInstanceId", "foreignSystemId", "foreignSystemSku", "groupCode", "", "Lyx2/h;", "premiumFeatures", "platformKey", "metaPackageSku", "billingIntervalKey", "contractTermKey", "billingIssue", "autoRenew", "nextBillingString", "promoEndDateString", "freeTrialEndDateString", "Lyx2/d;", "devices", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lm63/u1;)V", "Companion", "a", "b", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@i63.h
public final /* data */ class c implements Parcelable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f200047x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f200049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f200050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f200051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f200052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f200053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f200054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f200055h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f200056i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f200057j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<h> f200058k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f200059l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f200060m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f200061n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f200062o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f200063p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f200064q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f200065r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f200066t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f200067v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List<d> f200068w;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<c> CREATOR = new C3745c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/subscriptions/dto/CustomerSubscriptionDTO.$serializer", "Lm63/e0;", "Lyx2/c;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @o13.e
    public /* synthetic */ class a implements e0<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f200069a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f200069a = aVar;
            m1 m1Var = new m1("com.garmin.subscriptions.dto.CustomerSubscriptionDTO", aVar, 21);
            m1Var.j("partNumber", false);
            m1Var.j("isTrial", false);
            m1Var.j("isActive", false);
            m1Var.j("source", false);
            m1Var.j("expirationDate", false);
            m1Var.j("activationDate", false);
            m1Var.j("packageInstanceId", false);
            m1Var.j("foreignSystemId", false);
            m1Var.j("foreignSystemSku", false);
            m1Var.j("groupCode", false);
            m1Var.j("premiumFeatures", false);
            m1Var.j("platform", false);
            m1Var.j("metaPackageSku", false);
            m1Var.j("billingInterval", true);
            m1Var.j("contractTerm", true);
            m1Var.j("billingIssue", false);
            m1Var.j("autoRenew", false);
            m1Var.j("nextBillingDate", false);
            m1Var.j("promoEndDate", false);
            m1Var.j("freeTrialEndDate", false);
            m1Var.j("devices", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = c.f200047x;
            y1 y1Var = y1.f117048a;
            m63.g gVar = m63.g.f116948a;
            return new i63.c[]{y1Var, gVar, gVar, y1Var, y1Var, y1Var, j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), lVarArr[10].getValue(), y1Var, y1Var, j63.a.d(y1Var), j63.a.d(y1Var), gVar, gVar, j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(lVarArr[20].getValue())};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            int i14;
            int i15;
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = c.f200047x;
            int i16 = l63.c.f110557a;
            String str = null;
            List list = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            int i17 = 0;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            List list2 = null;
            String strR = null;
            String strR2 = null;
            String str9 = null;
            boolean z14 = true;
            String strR3 = null;
            String strR4 = null;
            String strR5 = null;
            boolean zG = false;
            boolean zG2 = false;
            boolean zG3 = false;
            boolean zG4 = false;
            String strR6 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        strR2 = strR2;
                        z14 = false;
                        strR2 = strR2;
                        break;
                    case 0:
                        strR = strR;
                        strR2 = strR2;
                        strR5 = cVarC.r(eVar2, 0);
                        i17 |= 1;
                        strR = strR;
                        strR2 = strR2;
                        break;
                    case 1:
                        strR = strR;
                        zG = cVarC.g(eVar2, 1);
                        i17 |= 2;
                        strR = strR;
                        break;
                    case 2:
                        strR = strR;
                        zG4 = cVarC.g(eVar2, 2);
                        i17 |= 4;
                        strR = strR;
                        break;
                    case 3:
                        strR = strR;
                        strR6 = cVarC.r(eVar2, 3);
                        i17 |= 8;
                        strR = strR;
                        break;
                    case 4:
                        strR = cVarC.r(eVar2, 4);
                        i17 |= 16;
                        break;
                    case 5:
                        strR = strR;
                        strR2 = cVarC.r(eVar2, 5);
                        i17 |= 32;
                        strR = strR;
                        break;
                    case 6:
                        strR = strR;
                        strR2 = strR2;
                        str9 = (String) cVarC.v(eVar2, 6, y1.f117048a, str9);
                        i17 |= 64;
                        strR = strR;
                        strR2 = strR2;
                        break;
                    case 7:
                        strR = strR;
                        strR2 = strR2;
                        str5 = (String) cVarC.v(eVar2, 7, y1.f117048a, str5);
                        i17 |= 128;
                        strR = strR;
                        strR2 = strR2;
                        break;
                    case 8:
                        strR = strR;
                        strR2 = strR2;
                        str3 = (String) cVarC.v(eVar2, 8, y1.f117048a, str3);
                        i17 |= 256;
                        strR = strR;
                        strR2 = strR2;
                        break;
                    case 9:
                        strR = strR;
                        strR2 = strR2;
                        str2 = (String) cVarC.v(eVar2, 9, y1.f117048a, str2);
                        i17 |= 512;
                        strR = strR;
                        strR2 = strR2;
                        break;
                    case 10:
                        strR = strR;
                        strR2 = strR2;
                        list = (List) cVarC.l(eVar2, 10, lVarArr[10].getValue(), list);
                        i17 |= 1024;
                        strR = strR;
                        strR2 = strR2;
                        break;
                    case 11:
                        strR = strR;
                        strR3 = cVarC.r(eVar2, 11);
                        i17 |= 2048;
                        strR = strR;
                        break;
                    case 12:
                        strR = strR;
                        strR4 = cVarC.r(eVar2, 12);
                        i17 |= 4096;
                        strR = strR;
                        break;
                    case 13:
                        strR = strR;
                        strR2 = strR2;
                        str = (String) cVarC.v(eVar2, 13, y1.f117048a, str);
                        i17 |= 8192;
                        strR = strR;
                        strR2 = strR2;
                        break;
                    case 14:
                        strR = strR;
                        strR2 = strR2;
                        str4 = (String) cVarC.v(eVar2, 14, y1.f117048a, str4);
                        i17 |= 16384;
                        strR = strR;
                        strR2 = strR2;
                        break;
                    case 15:
                        zG2 = cVarC.g(eVar2, 15);
                        i15 = 32768;
                        i17 |= i15;
                        strR = strR;
                        break;
                    case 16:
                        zG3 = cVarC.g(eVar2, 16);
                        i15 = 65536;
                        i17 |= i15;
                        strR = strR;
                        break;
                    case 17:
                        str6 = (String) cVarC.v(eVar2, 17, y1.f117048a, str6);
                        i14 = 131072;
                        i17 |= i14;
                        strR = strR;
                        strR2 = strR2;
                        break;
                    case 18:
                        str7 = (String) cVarC.v(eVar2, 18, y1.f117048a, str7);
                        i14 = GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                        i17 |= i14;
                        strR = strR;
                        strR2 = strR2;
                        break;
                    case 19:
                        str8 = (String) cVarC.v(eVar2, 19, y1.f117048a, str8);
                        i14 = 524288;
                        i17 |= i14;
                        strR = strR;
                        strR2 = strR2;
                        break;
                    case 20:
                        list2 = (List) cVarC.v(eVar2, 20, lVarArr[20].getValue(), list2);
                        i14 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        i17 |= i14;
                        strR = strR;
                        strR2 = strR2;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            cVarC.b(eVar2);
            List list3 = list2;
            String str10 = str8;
            return new c(i17, strR5, zG, zG4, strR6, strR, strR2, str9, str5, str3, str2, list, strR3, strR4, str, str4, zG2, zG3, str6, str7, str10, list3, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            c cVar = (c) obj;
            cVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = c.f200047x;
            String str = cVar.f200048a;
            String str2 = cVar.f200062o;
            String str3 = cVar.f200061n;
            dVarC.k(eVar, 0, str);
            dVarC.n(eVar, 1, cVar.f200049b);
            dVarC.n(eVar, 2, cVar.f200050c);
            dVarC.k(eVar, 3, cVar.f200051d);
            dVarC.k(eVar, 4, cVar.f200052e);
            dVarC.k(eVar, 5, cVar.f200053f);
            y1 y1Var = y1.f117048a;
            dVarC.d(eVar, 6, y1Var, cVar.f200054g);
            dVarC.d(eVar, 7, y1Var, cVar.f200055h);
            dVarC.d(eVar, 8, y1Var, cVar.f200056i);
            dVarC.d(eVar, 9, y1Var, cVar.f200057j);
            dVarC.e(eVar, 10, lVarArr[10].getValue(), cVar.f200058k);
            dVarC.k(eVar, 11, cVar.f200059l);
            dVarC.k(eVar, 12, cVar.f200060m);
            if (dVarC.C(eVar) || str3 != null) {
                dVarC.d(eVar, 13, y1Var, str3);
            }
            if (dVarC.C(eVar) || str2 != null) {
                dVarC.d(eVar, 14, y1Var, str2);
            }
            dVarC.n(eVar, 15, cVar.f200063p);
            dVarC.n(eVar, 16, cVar.f200064q);
            dVarC.d(eVar, 17, y1Var, cVar.f200065r);
            dVarC.d(eVar, 18, y1Var, cVar.f200066t);
            dVarC.d(eVar, 19, y1Var, cVar.f200067v);
            dVarC.d(eVar, 20, lVarArr[20].getValue(), cVar.f200068w);
            dVarC.b(eVar);
        }
    }

    /* JADX INFO: renamed from: yx2.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C3745c implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            boolean z14;
            int i14;
            ArrayList arrayList;
            parcel.getClass();
            String string = parcel.readString();
            boolean z15 = false;
            boolean z16 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z15 = true;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            int i15 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i15);
            int iA = 0;
            while (iA != i15) {
                iA = kg.f.a(h.CREATOR, parcel, arrayList2, iA, 1);
            }
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            boolean z17 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                i14 = 0;
                z14 = true;
            } else {
                z14 = false;
                i14 = 0;
            }
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            int i16 = i14;
            String string15 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i17 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i17);
                int iA2 = i16;
                while (iA2 != i17) {
                    iA2 = kg.f.a(d.CREATOR, parcel, arrayList3, iA2, 1);
                    z15 = z15;
                    i17 = i17;
                }
                arrayList = arrayList3;
            }
            return new c(string, z16, z15, string2, string3, string4, string5, string6, string7, string8, arrayList2, string9, string10, string11, string12, z17, z14, string13, string14, string15, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    static {
        o13.n nVar = o13.n.PUBLICATION;
        f200047x = new o13.l[]{null, null, null, null, null, null, null, null, null, null, o13.m.a(nVar, new b(0)), null, null, null, null, null, null, null, null, null, o13.m.a(nVar, new b(1))};
    }

    public /* synthetic */ c(int i14, String str, boolean z14, boolean z15, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, String str9, String str10, String str11, String str12, boolean z16, boolean z17, String str13, String str14, String str15, List list2, u1 u1Var) {
        if (2072575 != (i14 & 2072575)) {
            k1.h(i14, 2072575, a.f200069a.getF158591b());
            throw null;
        }
        this.f200048a = str;
        this.f200049b = z14;
        this.f200050c = z15;
        this.f200051d = str2;
        this.f200052e = str3;
        this.f200053f = str4;
        this.f200054g = str5;
        this.f200055h = str6;
        this.f200056i = str7;
        this.f200057j = str8;
        this.f200058k = list;
        this.f200059l = str9;
        this.f200060m = str10;
        if ((i14 & 8192) == 0) {
            this.f200061n = null;
        } else {
            this.f200061n = str11;
        }
        if ((i14 & 16384) == 0) {
            this.f200062o = null;
        } else {
            this.f200062o = str12;
        }
        this.f200063p = z16;
        this.f200064q = z17;
        this.f200065r = str13;
        this.f200066t = str14;
        this.f200067v = str15;
        this.f200068w = list2;
    }

    public final DateTime b() {
        DateTime dateTime = DateTime.parse(this.f200052e, ISODateTimeFormat.dateTimeParser().withZoneUTC());
        dateTime.getClass();
        return dateTime;
    }

    public final DateTime d() {
        String str = this.f200065r;
        if (str != null) {
            return DateTime.parse(str, ISODateTimeFormat.dateTimeParser().withZoneUTC());
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f200048a, cVar.f200048a) && this.f200049b == cVar.f200049b && this.f200050c == cVar.f200050c && s.g(this.f200051d, cVar.f200051d) && s.g(this.f200052e, cVar.f200052e) && s.g(this.f200053f, cVar.f200053f) && s.g(this.f200054g, cVar.f200054g) && s.g(this.f200055h, cVar.f200055h) && s.g(this.f200056i, cVar.f200056i) && s.g(this.f200057j, cVar.f200057j) && s.g(this.f200058k, cVar.f200058k) && s.g(this.f200059l, cVar.f200059l) && s.g(this.f200060m, cVar.f200060m) && s.g(this.f200061n, cVar.f200061n) && s.g(this.f200062o, cVar.f200062o) && this.f200063p == cVar.f200063p && this.f200064q == cVar.f200064q && s.g(this.f200065r, cVar.f200065r) && s.g(this.f200066t, cVar.f200066t) && s.g(this.f200067v, cVar.f200067v) && s.g(this.f200068w, cVar.f200068w);
    }

    public final boolean f() {
        return this.f200050c && b().getMillis() >= System.currentTimeMillis();
    }

    public final int hashCode() {
        int iJ = wr.g.j(wr.g.j(wr.g.j(q6.f.g(q6.f.g(this.f200048a.hashCode() * 31, 31, this.f200049b), 31, this.f200050c), 31, this.f200051d), 31, this.f200052e), 31, this.f200053f);
        String str = this.f200054g;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f200055h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f200056i;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f200057j;
        int iJ2 = wr.g.j(wr.g.j(u0.b((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f200058k), 31, this.f200059l), 31, this.f200060m);
        String str5 = this.f200061n;
        int iHashCode4 = (iJ2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f200062o;
        int iG = q6.f.g(q6.f.g((iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.f200063p), 31, this.f200064q);
        String str7 = this.f200065r;
        int iHashCode5 = (iG + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f200066t;
        int iHashCode6 = (iHashCode5 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f200067v;
        int iHashCode7 = (iHashCode6 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List<d> list = this.f200068w;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbD = zl.a.d("CustomerSubscriptionDTO(subscriptionPartNumber=", this.f200048a, ", isTrial=", this.f200049b, ", isActiveOnServer=");
        fb1.c.w(", source=", this.f200051d, ", expirationString=", sbD, this.f200050c);
        sn.a.t(sbD, this.f200052e, ", activationString=", this.f200053f, ", packageInstanceId=");
        sn.a.t(sbD, this.f200054g, ", foreignSystemId=", this.f200055h, ", foreignSystemSku=");
        sn.a.t(sbD, this.f200056i, ", groupCode=", this.f200057j, ", premiumFeatures=");
        o2.c.n(", platformKey=", this.f200059l, ", metaPackageSku=", sbD, this.f200058k);
        sn.a.t(sbD, this.f200060m, ", billingIntervalKey=", this.f200061n, ", contractTermKey=");
        v.h.C(this.f200062o, ", billingIssue=", ", autoRenew=", sbD, this.f200063p);
        fb1.c.w(", nextBillingString=", this.f200065r, ", promoEndDateString=", sbD, this.f200064q);
        sn.a.t(sbD, this.f200066t, ", freeTrialEndDateString=", this.f200067v, ", devices=");
        return z.c(sbD, this.f200068w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f200048a);
        parcel.writeInt(this.f200049b ? 1 : 0);
        parcel.writeInt(this.f200050c ? 1 : 0);
        parcel.writeString(this.f200051d);
        parcel.writeString(this.f200052e);
        parcel.writeString(this.f200053f);
        parcel.writeString(this.f200054g);
        parcel.writeString(this.f200055h);
        parcel.writeString(this.f200056i);
        parcel.writeString(this.f200057j);
        Iterator itE = kg.f.e(this.f200058k, parcel);
        while (itE.hasNext()) {
            h hVar = (h) itE.next();
            hVar.getClass();
            parcel.writeString(hVar.f200084a);
        }
        parcel.writeString(this.f200059l);
        parcel.writeString(this.f200060m);
        parcel.writeString(this.f200061n);
        parcel.writeString(this.f200062o);
        parcel.writeInt(this.f200063p ? 1 : 0);
        parcel.writeInt(this.f200064q ? 1 : 0);
        parcel.writeString(this.f200065r);
        parcel.writeString(this.f200066t);
        parcel.writeString(this.f200067v);
        List<d> list = this.f200068w;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            ((d) itO.next()).writeToParcel(parcel, i14);
        }
    }

    /* JADX INFO: renamed from: yx2.c$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyx2/c$b;", "", "<init>", "()V", "Li63/c;", "Lyx2/c;", "serializer", "()Li63/c;", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final i63.c<c> serializer() {
            return a.f200069a;
        }

        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    public c(String str, boolean z14, boolean z15, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<h> list, String str9, String str10, String str11, String str12, boolean z16, boolean z17, String str13, String str14, String str15, List<d> list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        str9.getClass();
        str10.getClass();
        this.f200048a = str;
        this.f200049b = z14;
        this.f200050c = z15;
        this.f200051d = str2;
        this.f200052e = str3;
        this.f200053f = str4;
        this.f200054g = str5;
        this.f200055h = str6;
        this.f200056i = str7;
        this.f200057j = str8;
        this.f200058k = list;
        this.f200059l = str9;
        this.f200060m = str10;
        this.f200061n = str11;
        this.f200062o = str12;
        this.f200063p = z16;
        this.f200064q = z17;
        this.f200065r = str13;
        this.f200066t = str14;
        this.f200067v = str15;
        this.f200068w = list2;
    }

    public /* synthetic */ c(String str, boolean z14, boolean z15, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, String str9, String str10, String str11, String str12, boolean z16, boolean z17, String str13, String str14, String str15, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, z14, z15, str2, str3, str4, str5, str6, str7, str8, list, str9, str10, (i14 & 8192) != 0 ? null : str11, (i14 & 16384) != 0 ? null : str12, z16, z17, str13, str14, str15, list2);
    }
}
