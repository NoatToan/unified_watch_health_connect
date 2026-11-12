package xy2;

import android.R;
import android.app.Activity;
import android.content.DialogInterface;
import android.widget.ArrayAdapter;
import com.garmin.uisynthesizer.synthesize.SynthesizerException;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.q;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import uy2.w0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Luy2/w0;", "<anonymous>", "(Lo53/b0;)Luy2/w0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.uisynthesizer.util.ActivityExtensionsKt$pickReturn$2", f = "ActivityExtensions.kt", l = {15}, m = "invokeSuspend", v = 2)
public final class a extends v13.i implements p<b0, t13.d<? super w0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f192714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f192715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f192716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<w0> f192717d;

    /* JADX INFO: renamed from: xy2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DialogInterfaceOnClickListenerC3604a implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t13.d<w0> f192718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<w0> f192719b;

        /* JADX WARN: Multi-variable type inference failed */
        public DialogInterfaceOnClickListenerC3604a(t13.d<? super w0> dVar, List<w0> list) {
            this.f192718a = dVar;
            this.f192719b = list;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i14) {
            int i15 = q.f128596b;
            this.f192718a.resumeWith(this.f192719b.get(i14));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Activity activity, List<w0> list, t13.d<? super a> dVar) {
        super(2, dVar);
        this.f192716c = activity;
        this.f192717d = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a(this.f192716c, this.f192717d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super w0> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f192715b;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        Activity activity = this.f192716c;
        List<w0> list = this.f192717d;
        this.f192714a = list;
        this.f192715b = 1;
        t13.i iVar = new t13.i(u13.f.b(this));
        try {
            androidx.appcompat.app.e.a title = new androidx.appcompat.app.e.a(activity).setTitle("[UI review] Possible Actions:");
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((w0) it.next()).f173466b);
            }
            title.setAdapter(new ArrayAdapter(activity, R.layout.simple_list_item_1, arrayList), new DialogInterfaceOnClickListenerC3604a(iVar, list)).setCancelable(false).show();
        } catch (Throwable th3) {
            int i15 = q.f128596b;
            iVar.resumeWith(new q.b(new SynthesizerException("Failed to create dialog for choosing possible returns", th3)));
        }
        Object objA = iVar.a();
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        return objA == aVar ? aVar : objA;
    }
}
