package com.garmin.android.apps.connectmobile.group.details.about.member;

import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/about/member/e;", "", "<init>", "()V", "a", "b", "Lcom/garmin/android/apps/connectmobile/group/details/about/member/e$a;", "Lcom/garmin/android/apps/connectmobile/group/details/about/member/e$b;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class e {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/about/member/e$a;", "Lcom/garmin/android/apps/connectmobile/group/details/about/member/e;", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupDTO$c;", "newRole", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;", "userDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupDTO$c;Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GroupDTO.c f36263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.connections.groups.services.model.b f36264b;

        static {
            com.garmin.android.apps.connectmobile.connections.groups.services.model.b.a aVar = com.garmin.android.apps.connectmobile.connections.groups.services.model.b.f31611q;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(GroupDTO.c cVar, com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar) {
            super(null);
            bVar.getClass();
            this.f36263a = cVar;
            this.f36264b = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f36263a == aVar.f36263a && s.g(this.f36264b, aVar.f36264b);
        }

        public final int hashCode() {
            GroupDTO.c cVar = this.f36263a;
            return this.f36264b.hashCode() + ((cVar == null ? 0 : cVar.hashCode()) * 31);
        }

        public final String toString() {
            return "ChangeRole(newRole=" + this.f36263a + ", userDTO=" + this.f36264b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/about/member/e$b;", "Lcom/garmin/android/apps/connectmobile/group/details/about/member/e;", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;", "userDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.connections.groups.services.model.b f36265a;

        static {
            com.garmin.android.apps.connectmobile.connections.groups.services.model.b.a aVar = com.garmin.android.apps.connectmobile.connections.groups.services.model.b.f31611q;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar) {
            super(null);
            bVar.getClass();
            this.f36265a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && s.g(this.f36265a, ((b) obj).f36265a);
        }

        public final int hashCode() {
            return this.f36265a.hashCode();
        }

        public final String toString() {
            return "RemoveFromGroup(userDTO=" + this.f36265a + ")";
        }
    }

    public /* synthetic */ e(j jVar) {
        this();
    }

    private e() {
    }
}
