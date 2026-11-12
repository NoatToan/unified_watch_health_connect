package ez1;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.R;
import com.mapbox.turf.TurfConstants;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0013\b\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lez1/f;", "Lez1/d;", "", "", TurfConstants.UNIT_MILES, "<init>", "(Ljava/lang/String;ILjava/lang/Integer;)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum f implements d {
    WORLD_WIDE(null),
    /* JADX INFO: Fake field, exist only in values array */
    MILES_25(25),
    MILES_50(50),
    /* JADX INFO: Fake field, exist only in values array */
    MILES_75(75),
    /* JADX INFO: Fake field, exist only in values array */
    MILES_100(100),
    /* JADX INFO: Fake field, exist only in values array */
    MILES_200(200);

    public static final Parcelable.Creator<f> CREATOR = new Parcelable.Creator<f>() { // from class: ez1.f.a
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            return f.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f67520a;

    f(Integer num) {
        this.f67520a = num;
    }

    @Override // ez1.d
    public final String c(Context context) {
        context.getClass();
        if (this == WORLD_WIDE) {
            String string = context.getString(R.string.event_search_worldwide);
            string.getClass();
            return string;
        }
        String string2 = context.getString(R.string.lbl_calories_within, this.f67520a);
        String string3 = context.getString(R.string.miles);
        string3.getClass();
        String lowerCase = string3.toLowerCase(Locale.ROOT);
        return zl.a.c(lowerCase, string2, StringUtils.SPACE, lowerCase);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // ez1.d
    public final Integer u1() {
        Integer num;
        if (this == WORLD_WIDE || (num = this.f67520a) == null) {
            return null;
        }
        return Integer.valueOf((int) (((double) num.intValue()) * 1609.344d));
    }

    @Override // ez1.d
    public final int w() {
        return ordinal();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
