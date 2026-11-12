package g62;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.k1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lg62/a0;", "Lcom/garmin/android/apps/connectmobile/b0;", "Lkotlin/Function1;", "Lm52/k;", "", "onSave", "<init>", "(Le23/l;)V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a0 extends com.garmin.android.apps.connectmobile.b0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f76053l = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e23.l<? super m52.k, Unit> f76054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m52.k f76055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f76056h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e0 f76057i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f76058j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o52.e f76059k;

    static {
        new a(null);
    }

    public a0(e23.l<? super m52.k, Unit> lVar) {
        super(R.layout.workout_action_bottom_sheet_header, R.layout.sports_list_bottom_sheet_content, false, false, false, 28, null);
        this.f76054f = lVar;
        this.f76056h = -1;
        this.f76059k = (o52.e) KoinJavaComponent.get$default(o52.e.class, null, null, 6, null);
    }

    @Override // com.garmin.android.apps.connectmobile.b0
    public final void u6(View view2) {
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(view2.getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(null);
        recyclerView.setMotionEventSplittingEnabled(false);
        bv.b.f21239a.getClass();
        bv.b.a();
        boolean zL0 = k1.f37122a.l0();
        m52.k.a aVar = m52.k.f116753m;
        o52.e eVar = this.f76059k;
        boolean zG = eVar.G();
        boolean zS = eVar.s();
        aVar.getClass();
        e0 e0Var = new e0(m52.k.a.b(zG, zS, zL0), new fp0.l(this, 4));
        this.f76057i = e0Var;
        recyclerView.setAdapter(e0Var);
    }

    @Override // com.garmin.android.apps.connectmobile.b0
    public final void v6(View view2) {
        View viewFindViewById = view2.findViewById(R.id.bottom_sheet_back_button);
        viewFindViewById.getClass();
        final int i14 = 0;
        v22.e.n(viewFindViewById, new e23.l(this) { // from class: g62.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f76125b;

            {
                this.f76125b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i15 = i14;
                a0 a0Var = this.f76125b;
                View view3 = (View) obj;
                switch (i15) {
                    case 0:
                        int i16 = a0.f76053l;
                        view3.getClass();
                        a0Var.dismiss();
                        break;
                    default:
                        int i17 = a0.f76053l;
                        view3.getClass();
                        m52.k kVar = a0Var.f76055g;
                        if (kVar != null) {
                            e23.l<? super m52.k, Unit> lVar = a0Var.f76054f;
                            if (lVar != null) {
                                lVar.invoke(kVar);
                            }
                            a0Var.dismiss();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        viewFindViewById.setVisibility(0);
        ((TextView) view2.findViewById(R.id.bottom_sheet_title)).setText(R.string.lbl_workout_add_another_leg);
        View viewFindViewById2 = view2.findViewById(R.id.bottom_sheet_action_button);
        viewFindViewById2.getClass();
        TextView textView = (TextView) viewFindViewById2;
        this.f76058j = textView;
        textView.setEnabled(false);
        TextView textView2 = this.f76058j;
        if (textView2 == null) {
            p005kotlin.jvm.internal.s.m("actionButton");
            throw null;
        }
        textView2.setText(R.string.lbl_done);
        TextView textView3 = this.f76058j;
        if (textView3 == null) {
            p005kotlin.jvm.internal.s.m("actionButton");
            throw null;
        }
        textView3.setVisibility(0);
        TextView textView4 = this.f76058j;
        if (textView4 == null) {
            p005kotlin.jvm.internal.s.m("actionButton");
            throw null;
        }
        final int i15 = 1;
        v22.e.n(textView4, new e23.l(this) { // from class: g62.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f76125b;

            {
                this.f76125b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                a0 a0Var = this.f76125b;
                View view3 = (View) obj;
                switch (i16) {
                    case 0:
                        int i17 = a0.f76053l;
                        view3.getClass();
                        a0Var.dismiss();
                        break;
                    default:
                        int i18 = a0.f76053l;
                        view3.getClass();
                        m52.k kVar = a0Var.f76055g;
                        if (kVar != null) {
                            e23.l<? super m52.k, Unit> lVar = a0Var.f76054f;
                            if (lVar != null) {
                                lVar.invoke(kVar);
                            }
                            a0Var.dismiss();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        });
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lg62/a0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ a0(e23.l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : lVar);
    }
}
