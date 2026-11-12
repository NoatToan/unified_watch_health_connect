package qn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000f¨\u0006\u0018"}, d2 = {"Lqn2/p;", "Lpn2/d;", "", "selectResult", "", "Lqn2/q;", "apduCommandList", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getSelectResult", "()Ljava/lang/String;", "f", "(Ljava/lang/String;)V", "b", "Ljava/util/List;", "()Ljava/util/List;", "setApduCommandList", "(Ljava/util/List;)V", "c", "getErrorMessage", "d", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p implements pn2.d {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("selectResult")
    private String selectResult;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("apduCommandList")
    private List<q> apduCommandList;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("errorMessage")
    private String errorMessage;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<p> {
        @Override // android.os.Parcelable.Creator
        public final p createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = kg.f.a(q.CREATOR, parcel, arrayList, iA, 1);
            }
            return new p(string, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final p[] newArray(int i14) {
            return new p[i14];
        }
    }

    public p(String str, List<q> list, String str2) {
        int length;
        list.getClass();
        this.selectResult = str;
        this.apduCommandList = list;
        this.errorMessage = str2;
        if (str != null && (2 > (length = str.length()) || length >= 4097)) {
            vb.h.x(am.j.h(str.length(), "selectResult length(2-4096): "));
            throw null;
        }
        String str3 = this.errorMessage;
        if (str3 != null) {
            int length2 = str3.length();
            if (1 > length2 || length2 >= 513) {
                vb.h.x(am.j.h(str3.length(), "errorMessage length(1-512): "));
                throw null;
            }
        }
    }

    public final List<q> b() {
        return this.apduCommandList;
    }

    public final void d(String str) {
        this.errorMessage = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return p005kotlin.jvm.internal.s.g(this.selectResult, pVar.selectResult) && p005kotlin.jvm.internal.s.g(this.apduCommandList, pVar.apduCommandList) && p005kotlin.jvm.internal.s.g(this.errorMessage, pVar.errorMessage);
    }

    public final void f(String str) {
        this.selectResult = str;
    }

    public final int hashCode() {
        String str = this.selectResult;
        int iB = u0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.apduCommandList);
        String str2 = this.errorMessage;
        return iB + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return am.j.o(this.errorMessage, ")", l2.g("FNRApduBlockDto(selectResult=", this.selectResult, ", apduCommandList=", this.apduCommandList, ", errorMessage="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.selectResult);
        Iterator itE = kg.f.e(this.apduCommandList, parcel);
        while (itE.hasNext()) {
            ((q) itE.next()).writeToParcel(parcel, i14);
        }
        parcel.writeString(this.errorMessage);
    }
}
