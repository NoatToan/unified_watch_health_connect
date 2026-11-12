package com.st.android.nfc_extensions;

import android.nfc.cardemulation.CardEmulation;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.fitness.motion.recognition.schedule.SceneRecogBroadcastReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class StAidGroup implements Parcelable {
    public static final Parcelable.Creator<StAidGroup> CREATOR;
    public static final boolean d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f10615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10616b;
    public final String c;

    public class a implements Parcelable.Creator<StAidGroup> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StAidGroup createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList();
            if (i > 0) {
                parcel.readStringList(arrayList);
            }
            return new StAidGroup(arrayList, string, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public StAidGroup[] newArray(int i) {
            return new StAidGroup[i];
        }
    }

    static {
        String str = Build.TYPE;
        d = (SceneRecogBroadcastReceiver.FROM_USER.equals(str) || "userdebug".equals(str)) ? false : true;
        CREATOR = new a();
    }

    public StAidGroup(List<String> list, String str, String str2) {
        if (d) {
            StringBuilder sb = new StringBuilder();
            sb.append("constructor - category: ");
            sb.append(str);
            sb.append(", description: ");
            sb.append(str2);
        }
        if (list == null || list.size() == 0) {
            this.f10615a = new ArrayList();
        } else {
            if (list.size() > 256) {
                throw new IllegalArgumentException("Too many AIDs in AID group.");
            }
            for (String str3 : list) {
                if (!CardEmulation.isValidAid(str3)) {
                    throw new IllegalArgumentException("AID " + str3 + " is not a valid AID.");
                }
            }
            this.f10615a = new ArrayList(list.size());
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.f10615a.add(it.next().toUpperCase());
            }
        }
        if (c(str)) {
            this.f10616b = str;
        } else {
            this.f10616b = "other";
        }
        this.c = str2;
    }

    public static boolean c(String str) {
        return "payment".equals(str) || "other".equals(str);
    }

    public String a() {
        return this.f10616b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Category: " + this.f10616b + ", AIDs:");
        Iterator<String> it = this.f10615a.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(", ");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10616b);
        parcel.writeInt(this.f10615a.size());
        if (this.f10615a.size() > 0) {
            parcel.writeStringList(this.f10615a);
        }
        parcel.writeString(this.c);
    }
}
