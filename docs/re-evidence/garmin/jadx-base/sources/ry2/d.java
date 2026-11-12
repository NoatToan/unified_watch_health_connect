package ry2;

import android.content.Intent;
import android.os.Bundle;
import androidx.core.view.j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import com.garmin.uisynthesizer.synthesize.SynthesizerException;
import e23.p;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import uy2.w0;
import xy2.k;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0004\u000e\u000f\u0010\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\r¨\u0006\u0012"}, d2 = {"Lry2/d;", "", "Lry2/d$b;", "factory", "<init>", "(Lry2/d$b;)V", "Li/c;", "activity", "Landroidx/lifecycle/x1;", "viewModelProvider", "(Li/c;Landroidx/lifecycle/x1;)V", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;Landroidx/lifecycle/x1;)V", "b", "d", "c", "a", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f155185b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f155186a;

    public interface b {
        <ViewModelType extends ry2.a<ViewModelType>, LifeCycleViewModelType extends u1> ViewModelType a(Class<ViewModelType> cls, Class<LifeCycleViewModelType> cls2);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lry2/d$c;", "Lry2/d$b;", "Landroidx/lifecycle/x1;", "viewModelProvider", "<init>", "(Landroidx/lifecycle/x1;)V", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x1 f155187a;

        public c(x1 x1Var) {
            x1Var.getClass();
            this.f155187a = x1Var;
        }

        @Override // ry2.d.b
        public final <ViewModelType extends ry2.a<ViewModelType>, LifeCycleViewModelType extends u1> ViewModelType a(Class<ViewModelType> cls, Class<LifeCycleViewModelType> cls2) {
            Object objB = this.f155187a.b(s0.f105811a.b(cls2));
            ViewModelType viewmodeltype = objB instanceof ry2.a ? (ViewModelType) objB : null;
            if (viewmodeltype != null) {
                return viewmodeltype;
            }
            throw new SynthesizerException(j.i(cls2, "Cannot cast ", " to the type passed for SynthesizableViewModel<>"));
        }
    }

    /* JADX INFO: renamed from: ry2.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B1\u0012(\u0010\u0007\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lry2/d$d;", "Lry2/d$b;", "Lkotlin/Function2;", "", "Luy2/w0;", "Lt13/d;", "", "pickReturn", "<init>", "(Le23/p;)V", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2939d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p<List<w0>, t13.d<? super w0>, Object> f155188a;

        /* JADX WARN: Multi-variable type inference failed */
        public C2939d(p<? super List<w0>, ? super t13.d<? super w0>, ? extends Object> pVar) {
            pVar.getClass();
            this.f155188a = pVar;
        }

        @Override // ry2.d.b
        public final <ViewModelType extends ry2.a<ViewModelType>, LifeCycleViewModelType extends u1> ViewModelType a(Class<ViewModelType> cls, Class<LifeCycleViewModelType> cls2) {
            ty2.b.f167282a.getClass();
            return (ViewModelType) ty2.b.b(cls, this.f155188a, new k[0]);
        }
    }

    public d(Fragment fragment, x1 x1Var) {
        e eVar;
        b cVar;
        fragment.getClass();
        x1Var.getClass();
        a aVar = f155185b;
        aVar.getClass();
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            aVar.getClass();
            eVar = (e) ((qy2.b) arguments.getParcelable("extra.synthesize.ui_review_config"));
        } else {
            eVar = null;
        }
        if (eVar != null) {
            m activity = fragment.getActivity();
            if (activity == null) {
                throw new SynthesizerException("Getting viewmodel before activity is attached is not supported yet.");
            }
            cVar = new C2939d(new ry2.c(activity));
        } else {
            cVar = new c(x1Var);
        }
        this(cVar);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lry2/d$a;", "", "<init>", "()V", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public d(i.c cVar, x1 x1Var) {
        b cVar2;
        cVar.getClass();
        x1Var.getClass();
        f155185b.getClass();
        Intent intent = cVar.getIntent();
        intent.getClass();
        if (((e) ((qy2.b) intent.getParcelableExtra("extra.synthesize.ui_review_config"))) != null) {
            cVar2 = new C2939d(new ry2.b(cVar));
        } else {
            cVar2 = new c(x1Var);
        }
        this(cVar2);
    }

    private d(b bVar) {
        this.f155186a = bVar;
    }
}
