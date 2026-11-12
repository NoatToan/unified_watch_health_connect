package com.garmin.android.apps.connectmobile.group.details.challenges;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupChallengeDTO;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupChallengePlayerDTO;
import com.garmin.android.gncs.NotificationConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.f;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import u62.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/challenges/a;", "", "<init>", "()V", "c", "b", "d", "a", "Lcom/garmin/android/apps/connectmobile/group/details/challenges/a$a;", "Lcom/garmin/android/apps/connectmobile/group/details/challenges/a$b;", "Lcom/garmin/android/apps/connectmobile/group/details/challenges/a$c;", "Lcom/garmin/android/apps/connectmobile/group/details/challenges/a$d;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.group.details.challenges.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/challenges/a$a;", "Lcom/garmin/android/apps/connectmobile/group/details/challenges/a;", "<init>", "()V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0637a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0637a f36289a = new C0637a();

        private C0637a() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/challenges/a$b;", "Lcom/garmin/android/apps/connectmobile/group/details/challenges/a;", "Landroid/os/Parcelable;", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupChallengeDTO;", "groupChallengeDTO", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupChallengePlayerDTO;", "rank1PlayerDTO", "", "shuffledPlayers", "<init>", "(Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupChallengeDTO;Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupChallengePlayerDTO;Ljava/util/List;)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends a implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new C0638a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GroupChallengeDTO f36290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final GroupChallengePlayerDTO f36291b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<GroupChallengePlayerDTO> f36292c;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.group.details.challenges.a$b$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0638a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                GroupChallengeDTO groupChallengeDTO = (GroupChallengeDTO) parcel.readParcelable(b.class.getClassLoader());
                GroupChallengePlayerDTO groupChallengePlayerDTO = (GroupChallengePlayerDTO) parcel.readParcelable(b.class.getClassLoader());
                int i14 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i14);
                int iD = 0;
                while (iD != i14) {
                    iD = u0.d(b.class, parcel, arrayList, iD, 1);
                }
                return new b(groupChallengeDTO, groupChallengePlayerDTO, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(GroupChallengeDTO groupChallengeDTO, GroupChallengePlayerDTO groupChallengePlayerDTO, List<? extends GroupChallengePlayerDTO> list) {
            super(null);
            groupChallengeDTO.getClass();
            groupChallengePlayerDTO.getClass();
            list.getClass();
            this.f36290a = groupChallengeDTO;
            this.f36291b = groupChallengePlayerDTO;
            this.f36292c = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.g(this.f36290a, bVar.f36290a) && s.g(this.f36291b, bVar.f36291b) && s.g(this.f36292c, bVar.f36292c);
        }

        public final int hashCode() {
            return this.f36292c.hashCode() + ((this.f36291b.hashCode() + (this.f36290a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("GroupChallengeListItem(groupChallengeDTO=");
            sb3.append(this.f36290a);
            sb3.append(", rank1PlayerDTO=");
            sb3.append(this.f36291b);
            sb3.append(", shuffledPlayers=");
            return z.c(sb3, this.f36292c, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeParcelable(this.f36290a, i14);
            parcel.writeParcelable(this.f36291b, i14);
            Iterator itE = f.e(this.f36292c, parcel);
            while (itE.hasNext()) {
                parcel.writeParcelable((Parcelable) itE.next(), i14);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/challenges/a$c;", "Lcom/garmin/android/apps/connectmobile/group/details/challenges/a;", "Lcom/garmin/android/apps/connectmobile/group/details/challenges/b;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Lcom/garmin/android/apps/connectmobile/group/details/challenges/b;)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.group.details.challenges.b f36293a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.garmin.android.apps.connectmobile.group.details.challenges.b bVar) {
            super(null);
            bVar.getClass();
            this.f36293a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f36293a == ((c) obj).f36293a;
        }

        public final int hashCode() {
            return this.f36293a.hashCode();
        }

        public final String toString() {
            return "GroupChallengeListTitle(type=" + this.f36293a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/challenges/a$d;", "Lcom/garmin/android/apps/connectmobile/group/details/challenges/a;", "Lcom/garmin/android/apps/connectmobile/group/details/challenges/b;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Lcom/garmin/android/apps/connectmobile/group/details/challenges/b;)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.group.details.challenges.b f36294a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.garmin.android.apps.connectmobile.group.details.challenges.b bVar) {
            super(null);
            bVar.getClass();
            this.f36294a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f36294a == ((d) obj).f36294a;
        }

        public final int hashCode() {
            return this.f36294a.hashCode();
        }

        public final String toString() {
            return "GroupChallengeListViewAllBtn(type=" + this.f36294a + ")";
        }
    }

    public /* synthetic */ a(j jVar) {
        this();
    }

    private a() {
    }
}
