package io2;

import am.j;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import d53.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.t0;
import p13.y;
import v.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0010BO\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lio2/d;", "Landroid/os/Parcelable;", "Lio2/c;", "pushProvCardInformationModel", "Lio2/a;", "dPPCardInformationModel", "", "pushAccountData", "", "accountHolderDataSupplied", "completeIssuerAppActivation", "completeWebsiteActivation", "callbackURL", "callbackRequired", "<init>", "(Lio2/c;Lio2/a;Ljava/lang/String;ZZZLjava/lang/String;Z)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Logger f94619j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f94620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io2.a f94621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f94622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f94623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f94624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f94625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f94626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f94627h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f94618i = new a(null);
    public static final Parcelable.Creator<d> CREATOR = new b();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            boolean z14;
            parcel.getClass();
            c cVarCreateFromParcel = parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel);
            io2.a aVarCreateFromParcel = parcel.readInt() != 0 ? io2.a.CREATOR.createFromParcel(parcel) : null;
            String string = parcel.readString();
            boolean z15 = false;
            boolean z16 = true;
            boolean z17 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z15 = true;
            }
            if (parcel.readInt() != 0) {
                z14 = false;
            } else {
                z16 = z15;
                z14 = z16;
            }
            return new d(cVarCreateFromParcel, aVarCreateFromParcel, string, z17, z15, z16, parcel.readString(), parcel.readInt() == 0 ? z14 : true);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f94619j = gt2.b.f79005a.h("PAY#PushProvDeepLinkData");
    }

    public d(c cVar, io2.a aVar, String str, boolean z14, boolean z15, boolean z16, String str2, boolean z17) {
        this.f94620a = cVar;
        this.f94621b = aVar;
        this.f94622c = str;
        this.f94623d = z14;
        this.f94624e = z15;
        this.f94625f = z16;
        this.f94626g = str2;
        this.f94627h = z17;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f94620a, dVar.f94620a) && s.g(this.f94621b, dVar.f94621b) && s.g(this.f94622c, dVar.f94622c) && this.f94623d == dVar.f94623d && this.f94624e == dVar.f94624e && this.f94625f == dVar.f94625f && s.g(this.f94626g, dVar.f94626g) && this.f94627h == dVar.f94627h;
    }

    public final int hashCode() {
        c cVar = this.f94620a;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        io2.a aVar = this.f94621b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.f94622c;
        int iG = q6.f.g(q6.f.g(q6.f.g((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f94623d), 31, this.f94624e), 31, this.f94625f);
        String str2 = this.f94626g;
        return Boolean.hashCode(this.f94627h) + ((iG + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PushProvDeepLinkData(pushProvCardInformationModel=");
        sb3.append(this.f94620a);
        sb3.append(", dPPCardInformationModel=");
        sb3.append(this.f94621b);
        sb3.append(", pushAccountData=");
        h.C(this.f94622c, ", accountHolderDataSupplied=", ", completeIssuerAppActivation=", sb3, this.f94623d);
        kg.f.q(", completeWebsiteActivation=", ", callbackURL=", sb3, this.f94624e, this.f94625f);
        return j.n(this.f94626g, ", callbackRequired=", ")", sb3, this.f94627h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        c cVar = this.f94620a;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, i14);
        }
        io2.a aVar = this.f94621b;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.f94622c);
        parcel.writeInt(this.f94623d ? 1 : 0);
        parcel.writeInt(this.f94624e ? 1 : 0);
        parcel.writeInt(this.f94625f ? 1 : 0);
        parcel.writeString(this.f94626g);
        parcel.writeInt(this.f94627h ? 1 : 0);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\t¨\u0006\u0011"}, d2 = {"Lio2/d$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "", "PUSH_ACCOUNT_RECEIPTS", "Ljava/lang/String;", "PUSH_ACCOUNT_DATA", "PUSH_TOKEN", "ACCOUNT_HOLDER_DATA_SUPPLIED", "COMPLETE_ISSUER_APP_ACTIVATION", "COMPLETE_WEBSITE_ACTIVATION", "CALLBACK_URL", "CALLBACK_REQUIRED", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static d a(String str) {
            boolean asBoolean;
            boolean asBoolean2;
            String str2;
            String str3;
            String str4;
            boolean z14;
            boolean z15;
            String asString;
            String str5;
            str.getClass();
            Uri uri = Uri.parse(str);
            ArrayList arrayList = new ArrayList();
            if (uri.isHierarchical()) {
                d.f94619j.debug("Uri is hierarchical. Check if 'pushAccountReceipts' parameter is present");
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                queryParameterNames.getClass();
                Set<String> set = queryParameterNames;
                int iA = t0.a(y.r(set, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (Object obj : set) {
                    linkedHashMap.put(obj, uri.getQueryParameters((String) obj));
                }
                if (linkedHashMap.containsKey("pushAccountData")) {
                    d.f94619j.debug("pushAccountData: Information is encrypted (MC)");
                    List list = (List) linkedHashMap.get("pushAccountData");
                    str3 = list != null ? (String) list.get(0) : null;
                    str2 = null;
                    str4 = null;
                } else if (linkedHashMap.containsKey("pushAccountReceipts")) {
                    d.f94619j.debug("pushAccountReceipts: Information is decrypted (MC). Continue to query from uri object");
                    List list2 = (List) linkedHashMap.get("pushAccountReceipts");
                    List listW = (list2 == null || (str5 = (String) list2.get(0)) == null) ? null : w.W(str5, new String[]{","});
                    if (listW != null) {
                        Iterator it = listW.iterator();
                        while (it.hasNext()) {
                            arrayList.add((String) it.next());
                        }
                    }
                    List list3 = (List) linkedHashMap.get("accountHolderDataSupplied");
                    boolean z16 = Boolean.parseBoolean(list3 != null ? (String) list3.get(0) : null);
                    List list4 = (List) linkedHashMap.get("completeIssuerAppActivation");
                    boolean z17 = Boolean.parseBoolean(list4 != null ? (String) list4.get(0) : null);
                    List list5 = (List) linkedHashMap.get("completeWebsiteActivation");
                    boolean z18 = Boolean.parseBoolean(list5 != null ? (String) list5.get(0) : null);
                    List list6 = (List) linkedHashMap.get("callbackRequired");
                    boolean z19 = Boolean.parseBoolean(list6 != null ? (String) list6.get(0) : null);
                    List list7 = (List) linkedHashMap.get("callbackURL");
                    z14 = z16;
                    asBoolean2 = z18;
                    z15 = z19;
                    str4 = list7 != null ? (String) list7.get(0) : null;
                    str2 = null;
                    str3 = null;
                    asBoolean = z17;
                } else if (linkedHashMap.containsKey("pushToken")) {
                    d.f94619j.debug("pushToken: Information is encrypted (Visa). Continue with add card flow");
                    List list8 = (List) linkedHashMap.get("pushToken");
                    str2 = list8 != null ? (String) list8.get(0) : null;
                    List list9 = (List) linkedHashMap.get("callbackURL");
                    str4 = list9 != null ? (String) list9.get(0) : null;
                    str3 = null;
                } else {
                    d.f94619j.error("Could not determine deep link data.");
                    str2 = null;
                    str3 = null;
                    str4 = null;
                }
                z14 = false;
                asBoolean = true;
                asBoolean2 = true;
                z15 = true;
            } else {
                d.f94619j.debug("Uri is not hierarchical. Transform into json object and retrieve data");
                aq2.j.f12491a.getClass();
                JsonObject jsonObject = (JsonObject) aq2.j.d().fromJson(str, JsonObject.class);
                JsonArray asJsonArray = jsonObject.getAsJsonArray("pushAccountReceipts");
                asJsonArray.getClass();
                Iterator<JsonElement> it3 = asJsonArray.iterator();
                while (it3.hasNext()) {
                    arrayList.add(it3.next().getAsString());
                }
                JsonElement jsonElement = jsonObject.get("accountHolderDataSupplied");
                boolean asBoolean3 = jsonElement != null ? jsonElement.getAsBoolean() : false;
                JsonElement jsonElement2 = jsonObject.get("completeIssuerAppActivation");
                asBoolean = jsonElement2 != null ? jsonElement2.getAsBoolean() : true;
                JsonElement jsonElement3 = jsonObject.get("completeWebsiteActivation");
                asBoolean2 = jsonElement3 != null ? jsonElement3.getAsBoolean() : true;
                JsonElement jsonElement4 = jsonObject.get("callbackRequired");
                boolean asBoolean4 = jsonElement4 != null ? jsonElement4.getAsBoolean() : true;
                JsonElement jsonElement5 = jsonObject.get("callbackURL");
                if (jsonElement5 == null || (asString = jsonElement5.getAsString()) == null) {
                    str2 = null;
                    str3 = null;
                    str4 = null;
                } else {
                    str4 = asString;
                    str2 = null;
                    str3 = null;
                }
                z14 = asBoolean3;
                z15 = asBoolean4;
            }
            return new d(new c(new f((String) h0.d0(arrayList)), null, 2, null), str2 != null ? new io2.a(str2) : null, str3, z14, asBoolean, asBoolean2, str4, z15);
        }

        private a() {
        }
    }
}
