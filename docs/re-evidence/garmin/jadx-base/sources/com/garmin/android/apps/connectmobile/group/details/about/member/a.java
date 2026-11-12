package com.garmin.android.apps.connectmobile.group.details.about.member;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/about/member/a;", "", "<init>", "()V", "a", "b", "Lcom/garmin/android/apps/connectmobile/group/details/about/member/a$a;", "Lcom/garmin/android/apps/connectmobile/group/details/about/member/a$b;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.group.details.about.member.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/about/member/a$a;", "Lcom/garmin/android/apps/connectmobile/group/details/about/member/a;", "", "headerTitleResId", "<init>", "(I)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C0629a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f36220a;

        public C0629a(int i14) {
            super(null);
            this.f36220a = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0629a) && this.f36220a == ((C0629a) obj).f36220a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f36220a);
        }

        public final String toString() {
            return e0.f(this.f36220a, "Header(headerTitleResId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/about/member/a$b;", "Lcom/garmin/android/apps/connectmobile/group/details/about/member/a;", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;", "groupConnectionDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.connections.groups.services.model.b f36221a;

        static {
            com.garmin.android.apps.connectmobile.connections.groups.services.model.b.a aVar = com.garmin.android.apps.connectmobile.connections.groups.services.model.b.f31611q;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar) {
            super(null);
            bVar.getClass();
            this.f36221a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && s.g(this.f36221a, ((b) obj).f36221a);
        }

        public final int hashCode() {
            return this.f36221a.hashCode();
        }

        public final String toString() {
            return "Member(groupConnectionDTO=" + this.f36221a + ")";
        }
    }

    public /* synthetic */ a(j jVar) {
        this();
    }

    private a() {
    }
}
