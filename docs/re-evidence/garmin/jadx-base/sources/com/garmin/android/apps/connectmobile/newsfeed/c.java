package com.garmin.android.apps.connectmobile.newsfeed;

import android.content.Context;
import android.content.Intent;
import e23.p;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.newsfeed.NewsFeedListFragment$onPostClickListener$1$onEditActivity$1", f = "NewsFeedListFragment.kt", l = {196}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewsFeedListFragment f39487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wg0.a f39488c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Landroid/content/Intent;", "<anonymous>", "(Lo53/b0;)Landroid/content/Intent;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.newsfeed.NewsFeedListFragment$onPostClickListener$1$onEditActivity$1$1", f = "NewsFeedListFragment.kt", l = {197}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Intent>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f39489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ NewsFeedListFragment f39490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ wg0.a f39491c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(NewsFeedListFragment newsFeedListFragment, wg0.a aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f39490b = newsFeedListFragment;
            this.f39491c = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f39490b, this.f39491c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Intent> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f39489a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            int i15 = NewsFeedListFragment.Y;
            NewsFeedListFragment newsFeedListFragment = this.f39490b;
            iz0.a aVarY6 = newsFeedListFragment.Y6();
            Context contextRequireContext = newsFeedListFragment.requireContext();
            contextRequireContext.getClass();
            Long l14 = this.f39491c.f185042a;
            this.f39489a = 1;
            Object objY = aVarY6.y(contextRequireContext, l14, this);
            return objY == aVar ? aVar : objY;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(NewsFeedListFragment newsFeedListFragment, wg0.a aVar, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f39487b = newsFeedListFragment;
        this.f39488c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f39487b, this.f39488c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f39486a;
        NewsFeedListFragment newsFeedListFragment = this.f39487b;
        if (i14 == 0) {
            r.b(obj);
            g22.e.l(newsFeedListFragment);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(newsFeedListFragment, this.f39488c, null);
            this.f39486a = 1;
            obj = ge1.b.e0(bVar, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        Intent intent = (Intent) obj;
        if (intent != null) {
            newsFeedListFragment.startActivity(intent);
        }
        g22.e.f(newsFeedListFragment);
        return Unit.INSTANCE;
    }
}
