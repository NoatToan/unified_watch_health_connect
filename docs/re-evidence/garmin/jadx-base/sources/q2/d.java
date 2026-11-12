package q2;

import android.R;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.textclassifier.TextClassification;
import f5.c0;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import u1.k1;
import u1.l1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0002\f\rB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lq2/d;", "Ls2/f;", "Landroid/view/View;", "view", "Lkotlin/Function1;", "Lq2/n;", "callbackInjector", "Lkotlin/Function0;", "Lf5/c0;", "coordinatesProvider", "<init>", "(Landroid/view/View;Le23/l;Le23/a;)V", "a", "b", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements s2.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f142154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<n, n> f142155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.a<c0> f142156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l1 f142157d = new l1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f4.v f142158e = new f4.v(new q2.a(this, 0));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q2.a f142159f = new q2.a(this, 1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q2.a f142160g = new q2.a(this, 2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ActionMode f142161h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public fh2.a f142162i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Runnable f142163j;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lq2/d$a;", "Lq2/n;", "Lo2/h;", "session", "Lkotlin/Function0;", "Lo2/d;", "dataBuilder", "Ln4/d;", "positioner", "Landroid/view/View;", "view", "<init>", "(Lo2/h;Le23/a;Le23/a;Landroid/view/View;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o2.h f142164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e23.a<o2.d> f142165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e23.a<n4.d> f142166c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final View f142167d;

        public a(o2.h hVar, e23.a<o2.d> aVar, e23.a<n4.d> aVar2, View view2) {
            this.f142164a = hVar;
            this.f142165b = aVar;
            this.f142166c = aVar2;
            this.f142167d = view2;
        }

        @Override // q2.n
        public final boolean a(Menu menu) {
            e(menu);
            return menu.size() > 0;
        }

        @Override // q2.n
        public final n4.d b() {
            return this.f142166c.invoke();
        }

        @Override // q2.n
        public final boolean c(Menu menu) {
            return e(menu);
        }

        @Override // q2.n
        public final void d() {
            this.f142164a.close();
        }

        public final boolean e(Menu menu) {
            int i14;
            o2.d dVarInvoke = this.f142165b.invoke();
            int i15 = 0;
            if (p005kotlin.jvm.internal.s.g(dVarInvoke, null)) {
                return false;
            }
            menu.clear();
            List<o2.b> list = dVarInvoke.f128625a;
            int size = list.size();
            int i16 = 0;
            int i17 = 1;
            int i18 = 1;
            while (i16 < size) {
                o2.b bVar = list.get(i16);
                if (bVar instanceof o2.e) {
                    i14 = i17 + 1;
                    final o2.e eVar = (o2.e) bVar;
                    MenuItem menuItemAdd = menu.add(i18, i17, i17, eVar.f128626b);
                    menuItemAdd.setShowAsAction(2);
                    final int i19 = 0;
                    menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: q2.c
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                            int i24 = i19;
                            Object obj = this;
                            Object obj2 = eVar;
                            switch (i24) {
                                case 0:
                                    ((o2.e) obj2).f128628d.invoke(((d.a) obj).f142164a);
                                    break;
                                default:
                                    Context context = (Context) obj2;
                                    TextClassification textClassification = (TextClassification) obj;
                                    x xVar = x.f142198a;
                                    q.f142189a.getClass();
                                    String text = textClassification.getText();
                                    q.a(PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592));
                                    break;
                            }
                            return true;
                        }
                    });
                } else {
                    if (bVar instanceof o2.i) {
                        i14 = i17 + 1;
                        x xVar = x.f142198a;
                        final Context context = this.f142167d.getContext();
                        o2.i iVar = (o2.i) bVar;
                        final TextClassification textClassification = iVar.f128636b;
                        int i24 = iVar.f128637c;
                        xVar.getClass();
                        if (i24 < 0) {
                            MenuItem menuItemAdd2 = menu.add(R.id.textAssist, R.id.textAssist, i17, textClassification.getLabel());
                            menuItemAdd2.setShowAsAction(2);
                            menuItemAdd2.setIcon(textClassification.getIcon());
                            final int i25 = 1;
                            menuItemAdd2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: q2.c
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                                    int i26 = i25;
                                    Object obj = textClassification;
                                    Object obj2 = context;
                                    switch (i26) {
                                        case 0:
                                            ((o2.e) obj2).f128628d.invoke(((d.a) obj).f142164a);
                                            break;
                                        default:
                                            Context context2 = (Context) obj2;
                                            TextClassification textClassification2 = (TextClassification) obj;
                                            x xVar2 = x.f142198a;
                                            q.f142189a.getClass();
                                            String text = textClassification2.getText();
                                            q.a(PendingIntent.getActivity(context2, text != null ? text.hashCode() : 0, textClassification2.getIntent(), 201326592));
                                            break;
                                    }
                                    return true;
                                }
                            });
                        } else {
                            int i26 = i24 == 0 ? 1 : i15;
                            RemoteAction remoteAction = textClassification.getActions().get(i24);
                            MenuItem menuItemAdd3 = menu.add(R.id.textAssist, i26 != 0 ? 16908353 : i15, i17, remoteAction.getTitle());
                            menuItemAdd3.setShowAsAction(i26 == 0 ? 0 : 2);
                            if (i26 != 0 || remoteAction.shouldShowIcon()) {
                                menuItemAdd3.setIcon(remoteAction.getIcon().loadDrawable(context));
                            }
                            menuItemAdd3.setOnMenuItemClickListener(new h10.e(remoteAction, 1));
                        }
                    } else if (bVar instanceof o2.g) {
                        i18++;
                    }
                    i16++;
                    i15 = 0;
                }
                i17 = i14;
                i16++;
                i15 = 0;
            }
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq2/d$b;", "Lo2/h;", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements o2.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q53.b f142168a = q53.l.a(0, 7, null);

        @Override // o2.h
        public final void close() {
            this.f142168a.i(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(View view2, e23.l<? super n, ? extends n> lVar, e23.a<? extends c0> aVar) {
        this.f142154a = view2;
        this.f142155b = lVar;
        this.f142156c = aVar;
    }

    @Override // s2.f
    public final Object a(s2.e eVar, v13.i iVar) {
        Object objB = this.f142157d.b(k1.Default, new e(this, eVar, null), iVar);
        return objB == u13.a.COROUTINE_SUSPENDED ? objB : Unit.INSTANCE;
    }
}
