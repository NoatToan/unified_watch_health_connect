package com.garmin.android.apps.connectmobile.workouts.presentation.edit;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB%\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/c;", "", "Ll52/i$b;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/j0;", "sourcePath", "targetPath", "<init>", "(Ll52/i$b;Ll52/i$b;)V", "a", "b", "c", "d", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/c$a;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/c$b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/c$c;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/c$d;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> f48935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> f48936b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/c$a;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/c;", "Ll52/i$b;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/j0;", "sourcePath", "destPath", "<init>", "(Ll52/i$b;Ll52/i$b;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f48937c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar, l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar2) {
            super(bVar, bVar2, null);
            bVar.getClass();
            bVar2.getClass();
            this.f48937c = R.string.lbl_move_below_value;
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.c
        public final void b(l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar, l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar2) {
            bVar.delete();
            bVar2.j(new l52.k(bVar, 3));
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.c
        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getF48940c() {
            return this.f48937c;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/c$b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/c;", "Ll52/i$b;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/j0;", "sourcePath", "destPath", "<init>", "(Ll52/i$b;Ll52/i$b;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f48938c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar, l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar2) {
            super(bVar, bVar2, null);
            bVar.getClass();
            bVar2.getClass();
            this.f48938c = R.string.lbl_move_above_value;
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.c
        public final void b(l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar, l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar2) {
            bVar.delete();
            bVar2.i(new l52.k(bVar, 1));
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.c
        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getF48940c() {
            return this.f48938c;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.edit.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/c$c;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/c;", "Ll52/i$b;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/j0;", "sourcePath", "destPath", "<init>", "(Ll52/i$b;Ll52/i$b;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0955c extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f48939c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0955c(l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar, l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar2) {
            super(bVar, bVar2, null);
            bVar.getClass();
            bVar2.getClass();
            this.f48939c = R.string.lbl_move_below_value;
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.c
        public final void b(l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar, l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar2) {
            if (bVar2 instanceof l52.e.a) {
                bVar.delete();
                ((l52.e.a) bVar2).g(new l52.k(bVar, 2));
            }
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.c
        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getF48940c() {
            return this.f48939c;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/c$d;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/c;", "Ll52/i$b;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/j0;", "sourcePath", "destPath", "<init>", "(Ll52/i$b;Ll52/i$b;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f48940c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar, l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar2) {
            super(bVar, bVar2, null);
            bVar.getClass();
            bVar2.getClass();
            this.f48940c = R.string.lbl_move_above_value;
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.c
        public final void b(l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar, l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar2) {
            if (bVar2 instanceof l52.e.a) {
                bVar.delete();
                l52.l.b((l52.e.a) bVar2, bVar);
            }
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.c
        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getF48940c() {
            return this.f48940c;
        }
    }

    private c(l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar, l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar2) {
        this.f48935a = bVar;
        this.f48936b = bVar2;
    }

    public final o13.u<l52.e<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>> a(l52.i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> iVar) {
        l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVarN3;
        iVar.getClass();
        l52.m mVarL1 = iVar.L1(l52.w.a.f110375a);
        l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVarN4 = mVarL1.n3(this.f48935a);
        if (bVarN4 == null || (bVarN3 = mVarL1.n3(this.f48936b)) == null) {
            return null;
        }
        b(bVarN4, bVarN3);
        return new o13.u<>(mVarL1, bVarN4, bVarN3);
    }

    public abstract void b(l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar, l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar2);

    /* JADX INFO: renamed from: c */
    public abstract int getF48940c();

    public /* synthetic */ c(l52.i.b bVar, l52.i.b bVar2, p005kotlin.jvm.internal.j jVar) {
        this(bVar, bVar2);
    }
}
