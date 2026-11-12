package s52;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ls52/o;", "Lcom/garmin/android/apps/connectmobile/repcounting/model/a;", "Lcom/garmin/android/apps/connectmobile/repcounting/model/d;", "exerciseListItem", "linkedToExercise", "<init>", "(Lcom/garmin/android/apps/connectmobile/repcounting/model/d;Lcom/garmin/android/apps/connectmobile/repcounting/model/d;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o extends com.garmin.android.apps.connectmobile.repcounting.model.a {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.repcounting.model.d f157459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.repcounting.model.d f157460c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<o> {
        @Override // android.os.Parcelable.Creator
        public final o createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new o((com.garmin.android.apps.connectmobile.repcounting.model.d) parcel.readParcelable(o.class.getClassLoader()), (com.garmin.android.apps.connectmobile.repcounting.model.d) parcel.readParcelable(o.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final o[] newArray(int i14) {
            return new o[i14];
        }
    }

    static {
        com.garmin.android.apps.connectmobile.repcounting.model.d.b bVar = com.garmin.android.apps.connectmobile.repcounting.model.d.f41101j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.garmin.android.apps.connectmobile.repcounting.model.d dVar, com.garmin.android.apps.connectmobile.repcounting.model.d dVar2) {
        super(dVar);
        dVar.getClass();
        dVar2.getClass();
        this.f157459b = dVar;
        this.f157460c = dVar2;
    }

    @Override // com.garmin.android.apps.connectmobile.repcounting.model.a
    public final String b(Context context) {
        return context.getString(R.string.string_space_string_pattern, context.getString(R.string.lbl_linked_to_colon), this.f157460c.f41107f);
    }

    @Override // com.garmin.android.apps.connectmobile.repcounting.model.a, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.f157459b, i14);
        parcel.writeParcelable(this.f157460c, i14);
    }
}
