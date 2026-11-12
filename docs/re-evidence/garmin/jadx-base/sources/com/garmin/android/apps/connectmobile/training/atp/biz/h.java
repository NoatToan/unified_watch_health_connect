package com.garmin.android.apps.connectmobile.training.atp.biz;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\nB\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/biz/h;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "", "Lxw1/h;", "", "contentfulLanguage", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Ljava/lang/String;Lcom/garmin/android/library/backgroundtaskmanagement/b$a;)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class h extends com.garmin.android.library.backgroundtaskmanagement.b<List<? extends xw1.h>> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f45159l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f45160m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f45161n;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/biz/h$a;", "", "", "json", "<init>", "(Ljava/lang/String;)V", "c", "b", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f45162a;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.training.atp.biz.h$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/biz/h$a$a;", "", "Lxw1/g;", "fields", "<init>", "(Lxw1/g;)V", "a", "Lxw1/g;", "()Lxw1/g;", "setFields", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0867a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @SerializedName("fields")
            private xw1.g fields;

            public C0867a(xw1.g gVar) {
                this.fields = gVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final xw1.g getFields() {
                return this.fields;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/biz/h$a$b;", "", "Lcom/garmin/android/apps/connectmobile/training/atp/biz/h$a$a;", "coaches", "<init>", "(Lcom/garmin/android/apps/connectmobile/training/atp/biz/h$a$a;)V", "a", "Lcom/garmin/android/apps/connectmobile/training/atp/biz/h$a$a;", "()Lcom/garmin/android/apps/connectmobile/training/atp/biz/h$a$a;", "setCoaches", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @SerializedName("Coaches")
            private C0867a coaches;

            public b(C0867a c0867a) {
                this.coaches = c0867a;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final C0867a getCoaches() {
                return this.coaches;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/biz/h$a$c;", "", "Lcom/garmin/android/apps/connectmobile/training/atp/biz/h$a$b;", "data", "<init>", "(Lcom/garmin/android/apps/connectmobile/training/atp/biz/h$a$b;)V", "a", "Lcom/garmin/android/apps/connectmobile/training/atp/biz/h$a$b;", "()Lcom/garmin/android/apps/connectmobile/training/atp/biz/h$a$b;", "setData", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @SerializedName("data")
            private b data;

            public c(b bVar) {
                this.data = bVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final b getData() {
                return this.data;
            }
        }

        public a(String str) {
            this.f45162a = str;
        }

        public final xw1.g a() {
            b data;
            C0867a coaches;
            c cVar = (c) new iu1.g().b(c.class, this.f45162a);
            if (cVar == null || (data = cVar.getData()) == null || (coaches = data.getCoaches()) == null) {
                return null;
            }
            return coaches.getFields();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/training/atp/biz/h$b", "Liu1/j;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements iu1.j {
        public b() {
        }

        @Override // iu1.j
        public final void c(String str) {
            xw1.g gVarA = new a(str).a();
            List list = (List) h.this.f50097g.get(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE);
            ArrayList arrayList = null;
            String coachKey = gVarA != null ? gVarA.getCoachKey() : null;
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (p005kotlin.jvm.internal.s.g(((xw1.h) obj).h(), coachKey)) {
                        arrayList.add(obj);
                    }
                }
            }
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((xw1.h) it.next()).e0(gVarA);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/training/atp/biz/h$c", "Liu1/j;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements iu1.j {
        public c() {
        }

        @Override // iu1.j
        public final void c(String str) {
            xw1.o oVarA = new d(str).a();
            List list = (List) h.this.f50097g.get(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE);
            ArrayList arrayList = null;
            String videoKey = oVarA != null ? oVarA.getVideoKey() : null;
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (p005kotlin.jvm.internal.s.g(((xw1.h) obj).G(), videoKey)) {
                        arrayList.add(obj);
                    }
                }
            }
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((xw1.h) it.next()).f192397q = oVarA;
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, aVar);
        str.getClass();
        this.f45159l = str;
        this.f45160m = new b();
        this.f45161n = new c();
    }
}
