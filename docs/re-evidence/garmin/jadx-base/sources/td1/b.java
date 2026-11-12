package td1;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.core.view.s;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.b0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.d3;
import i3.e5;
import java.util.ArrayList;
import java.util.List;
import jd1.h;
import o13.m;
import o13.t;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p13.j0;
import p13.w;
import sg0.w0;
import ta0.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Ltd1/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "b", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b extends Fragment {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f163884i = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC3083b f163886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f163887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public td1.a f163888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public pd1.b f163889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pd1.c f163890f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d3 f163892h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f163885a = m.b(new g(6));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w1 f163891g = new w1(s0.f105811a.b(h.class), new d(this), new w0(this, 20), new e(null, this));

    /* JADX INFO: renamed from: td1.b$b, reason: collision with other inner class name */
    public interface InterfaceC3083b {
        void G6(pd1.b bVar);

        void k5(pd1.b bVar);

        void m3(pd1.b bVar);
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"td1/b$c", "Landroidx/core/view/s;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements s {
        public c() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            menu.getClass();
            menuInflater.getClass();
            b bVar = b.this;
            menuInflater.inflate(bVar.f163887c ? R.menu.save_menu : bVar.v6(), menu);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            int itemId = menuItem.getItemId();
            b bVar = b.this;
            if (itemId != R.id.menu_item_add && itemId != R.id.save_menu_item) {
                bVar.A6().debug("onOptionsItemSelected: returning super ");
                return false;
            }
            bVar.A6().debug("onOptionsItemSelected: saving reminder");
            td1.a aVar = bVar.f163888d;
            if (aVar == null) {
                p005kotlin.jvm.internal.s.m("daysOfWeekAdapter");
                throw null;
            }
            pd1.b bVar2 = aVar.f163882a;
            bVar2.r(bVar.C6());
            bVar2.t(DateTime.now());
            List<Integer> listF = bVar2.f();
            if (listF == null) {
                listF = j0.f134944a;
            }
            String occurrence = bVar2.getOccurrence();
            wd1.a[] aVarArrValues = wd1.a.values();
            ArrayList arrayList = new ArrayList(aVarArrValues.length);
            int length = aVarArrValues.length;
            for (int iD = 0; iD < length; iD = e5.d(aVarArrValues[iD].f184373b, iD, arrayList, 1)) {
            }
            String str = "DAILY";
            if (listF.containsAll(arrayList) || p005kotlin.jvm.internal.s.g(occurrence, "DAILY")) {
                bVar.A6().debug("saveReminder: All days selected, making this a DAILY occurrence");
                listF = w.c(0);
            } else {
                if (listF.size() > 1 && listF.contains(0)) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(listF);
                    arrayList2.remove((Object) 0);
                    listF = h0.b1(arrayList2);
                }
                bVar.A6().debug("saveReminder: Only " + (listF != null ? Integer.valueOf(listF.size()) : null) + " days selected, setting to WEEKLY occurrence");
                str = "WEEKLY";
            }
            bVar2.q(listF);
            bVar2.o(str);
            if (!bVar.G6(bVar2)) {
                return true;
            }
            pd1.c cVar = bVar.f163890f;
            if (cVar == null) {
                p005kotlin.jvm.internal.s.m("userReminderListDTO");
                throw null;
            }
            List<pd1.b> listF2 = cVar.f();
            if (listF2 == null) {
                listF2 = j0.f134944a;
            }
            ArrayList arrayList3 = new ArrayList();
            if (listF2.isEmpty()) {
                bVar.A6().error("saveReminder: old reminders list is null");
            } else {
                arrayList3.addAll(listF2);
            }
            if (!bVar.f163887c) {
                arrayList3.add(bVar2);
            }
            pd1.c cVar2 = bVar.f163890f;
            if (cVar2 == null) {
                p005kotlin.jvm.internal.s.m("userReminderListDTO");
                throw null;
            }
            cVar2.h(arrayList3);
            bVar.A6().debug("saveReminder: Starting save operation");
            h hVar = (h) bVar.f163891g.getValue();
            pd1.c cVar3 = bVar.f163890f;
            if (cVar3 != null) {
                hVar.D4(cVar3);
                return true;
            }
            p005kotlin.jvm.internal.s.m("userReminderListDTO");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f163894a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f163894a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f163894a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f163895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f163896b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f163895a = aVar;
            this.f163896b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f163895a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f163896b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    static {
        new a(null);
    }

    public final Logger A6() {
        return (Logger) this.f163885a.getValue();
    }

    public abstract String C6();

    public final pd1.b E6() {
        pd1.b bVar = this.f163889e;
        if (bVar != null) {
            return bVar;
        }
        p005kotlin.jvm.internal.s.m("reminderDTO");
        throw null;
    }

    public abstract pd1.a F6();

    public boolean G6(pd1.b bVar) {
        bVar.getClass();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Parcelable parcelable;
        pd1.b bVarU6;
        Parcelable parcelable2;
        context.getClass();
        super.onAttach(context);
        try {
            a7.e activity = getActivity();
            activity.getClass();
            this.f163886b = (InterfaceC3083b) activity;
            a7.e activity2 = getActivity();
            activity2.getClass();
            this.f163892h = (d3) activity2;
        } catch (Exception e4) {
            A6().error("Could not attach NewReminderListener or ToolbarListener to fragment!", (Throwable) e4);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("reminders_list_dto_bundle_key", pd1.c.class);
            } else {
                Parcelable parcelable3 = arguments.getParcelable("reminders_list_dto_bundle_key");
                if (!(parcelable3 instanceof pd1.c)) {
                    parcelable3 = null;
                }
                parcelable = (pd1.c) parcelable3;
            }
            pd1.c cVar = (pd1.c) parcelable;
            if (cVar == null) {
                cVar = new pd1.c(null, null, null, 7, null);
            }
            this.f163890f = cVar;
            if (arguments.containsKey("new_reminder_bundle_key")) {
                this.f163887c = true;
                if (i14 >= 33) {
                    parcelable2 = (Parcelable) arguments.getParcelable("new_reminder_bundle_key", pd1.b.class);
                } else {
                    Parcelable parcelable4 = arguments.getParcelable("new_reminder_bundle_key");
                    parcelable2 = (pd1.b) (parcelable4 instanceof pd1.b ? parcelable4 : null);
                }
                bVarU6 = (pd1.b) parcelable2;
                if (bVarU6 == null) {
                    getContext();
                    bVarU6 = u6();
                }
            } else {
                getContext();
                bVarU6 = u6();
            }
            this.f163889e = bVarU6;
            wr.g.y("Starting in edit mode: ", this.f163887c, A6());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f163886b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        String string = this.f163887c ? getString(R.string.pregnancy_edit_reminder) : w6();
        string.getClass();
        d3 d3Var = this.f163892h;
        if (d3Var != null) {
            d3Var.updateActionBar(string, 3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        c cVar = new c();
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        mVarRequireActivity.addMenuProvider(cVar, getViewLifecycleOwner(), b0.b.RESUMED);
    }

    public final pd1.b u6() {
        Integer numValueOf = Integer.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk());
        String strName = F6().name();
        ArrayList arrayList = new ArrayList();
        wd1.a[] aVarArrValues = wd1.a.values();
        ArrayList arrayList2 = new ArrayList(aVarArrValues.length);
        int length = aVarArrValues.length;
        for (int iD = 0; iD < length; iD = e5.d(aVarArrValues[iD].f184373b, iD, arrayList2, 1)) {
        }
        arrayList.addAll(arrayList2);
        Unit unit = Unit.INSTANCE;
        return new pd1.b(null, numValueOf, strName, "WEEKLY", arrayList, z6(), y6(), Boolean.TRUE, DateTime.now(), DateTime.now(), 1, null);
    }

    public abstract int v6();

    public abstract String w6();

    public abstract String y6();

    public abstract List<Integer> z6();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ltd1/b$a;", "", "<init>", "()V", "", "REMINDERS_LIST_DTO_BUNDLE_KEY", "Ljava/lang/String;", "NEW_REMINDER_BUNDLE_KEY", "", "MAXIMUM_CHARACTER_LIMIT", "I", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
