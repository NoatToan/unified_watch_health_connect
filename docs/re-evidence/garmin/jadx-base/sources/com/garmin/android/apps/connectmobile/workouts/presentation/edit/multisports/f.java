package com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.media3.exoplayer.u;
import androidx.recyclerview.widget.RecyclerView;
import aq.b0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connectiq.v;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.h0;
import e23.p;
import i3.e5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m52.k;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0013\u0014BM\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/multisports/f;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lsq0/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/multisports/f$b;", "optionListener", "Lsq0/e;", "dragStartListener", "Lsq0/d;", "dragEndListener", "Lkotlin/Function2;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/h0;", "", "", "onSelectedCallback", "<init>", "(Landroid/content/Context;Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/multisports/f$b;Lsq0/e;Lsq0/d;Le23/p;)V", "b", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends RecyclerView.h<RecyclerView.f0> implements sq0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f49176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f49177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sq0.e f49178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sq0.d f49179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p<h0, Integer, Unit> f49180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f49181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WorkoutDetailsDTO f49182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f49183h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f49184i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinkedHashMap f49185j;

    public interface b {
        void a(h0 h0Var);

        void b(int i14);

        void c(int i14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(Context context, b bVar, sq0.e eVar, sq0.d dVar, p<? super h0, ? super Integer, Unit> pVar) {
        context.getClass();
        pVar.getClass();
        this.f49176a = context;
        this.f49177b = bVar;
        this.f49178c = eVar;
        this.f49179d = dVar;
        this.f49180e = pVar;
        this.f49182g = new WorkoutDetailsDTO();
        this.f49183h = new ArrayList();
        this.f49184i = -1;
        this.f49185j = new LinkedHashMap();
    }

    @Override // sq0.b
    public final int K0() {
        return 0;
    }

    @Override // sq0.b
    public final boolean f(int i14, int i15) {
        if (!s.g(this.f49181f, Boolean.TRUE)) {
            return false;
        }
        Collections.swap(this.f49183h, i14, i15);
        notifyItemMoved(i14, i15);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f49183h.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        return s.g(this.f49181f, Boolean.TRUE) ? 900 : -1;
    }

    @Override // sq0.b
    public final void h8(int i14) {
        this.f49183h.remove(i14);
        notifyItemRemoved(i14);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(final RecyclerView.f0 f0Var, int i14) {
        u4.d dVar;
        f0Var.getClass();
        if (f0Var instanceof q62.b) {
            h0 h0Var = (h0) this.f49183h.get(i14);
            k kVar = h0Var.f48193h;
            bv.b.f21239a.getClass();
            bv.b.a();
            boolean zL0 = k1.f37122a.l0();
            q62.b bVar = (q62.b) f0Var;
            Boolean bool = this.f49181f;
            Boolean bool2 = Boolean.TRUE;
            boolean zG = s.g(bool, bool2);
            bVar.f143188n = zG;
            if (zG) {
                bVar.d();
            }
            bVar.f143189o = s.g(this.f49181f, Boolean.FALSE);
            String string = this.f49176a.getString(kVar.d(zL0));
            string.getClass();
            v52.g gVar = v52.g.f175774a;
            Context context = this.f49176a;
            WorkoutDetailsDTO workoutDetailsDTO = this.f49182g;
            LinkedHashMap linkedHashMap = this.f49185j;
            gVar.getClass();
            String strA = v52.g.a(context, workoutDetailsDTO, h0Var, linkedHashMap);
            String strA2 = v52.g.a(this.f49176a, this.f49182g, h0Var, this.f49185j);
            TextView textView = bVar.f143177c;
            TextView textView2 = bVar.f143176b;
            textView2.setText(string);
            boolean z14 = false;
            textView2.setVisibility(0);
            textView.setText(strA);
            textView.setContentDescription(strA2);
            textView.setVisibility(0);
            if (!zL0 || (dVar = kVar.f116773i) == null) {
                dVar = kVar.f116772h;
            }
            dVar.getClass();
            ComposeView composeView = bVar.f143179e;
            composeView.setContent(new z3.e(-1821155231, true, new b82.k(dVar, 10)));
            ComposeView composeView2 = bVar.f143187m;
            q62.a.f143171a.getClass();
            composeView2.setContent(q62.a.f143173c);
            composeView.setVisibility(0);
            bVar.f143182h.setText(R.string.lbl_delete);
            bVar.f143183i.setText(R.string.workout_lbl_duplicate);
            v22.e.v(bVar.f143181g, bVar.f143189o && !bVar.f143188n);
            bVar.f143184j.f49739j = !bVar.f143189o;
            if (s.g(this.f49181f, bool2)) {
                bVar.f143190p = this.f49178c;
                bVar.f143191q = this.f49179d;
            }
            boolean zD = h0Var.d();
            ImageView imageView = bVar.f143185k;
            if (!zD && !bVar.f143188n) {
                z14 = true;
            }
            v22.e.v(imageView, z14);
            v22.e.v(bVar.f143178d, bVar.f143188n);
            v22.e.v(bVar.f143186l, bVar.f143188n);
            ComposeView composeView3 = bVar.f143187m;
            v22.e.v(composeView3, bVar.f143188n);
            composeView3.setOnTouchListener(new b00.g(bVar, 5));
            final int i15 = 0;
            bVar.f143182h.setOnClickListener(new View.OnClickListener(this) { // from class: g62.b0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f f76062b;

                {
                    this.f76062b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i15) {
                        case 0:
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar = this.f76062b;
                            Context context2 = fVar.f49176a;
                            q62.b bVar2 = (q62.b) f0Var;
                            fVar.t(context2, bVar2, bVar2.getBindingAdapterPosition());
                            break;
                        case 1:
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar2 = this.f76062b;
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f.b bVar3 = fVar2.f49177b;
                            ArrayList arrayList = fVar2.f49183h;
                            if (bVar3 != null) {
                                q62.b bVar4 = (q62.b) f0Var;
                                bVar3.a((h0) arrayList.get(bVar4.getBindingAdapterPosition()));
                                arrayList.add((h0) arrayList.get(bVar4.getBindingAdapterPosition()));
                                fVar2.notifyDataSetChanged();
                                bVar4.d();
                            }
                            break;
                        case 2:
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar3 = this.f76062b;
                            Context context3 = fVar3.f49176a;
                            q62.b bVar5 = (q62.b) f0Var;
                            fVar3.t(context3, bVar5, bVar5.getBindingAdapterPosition());
                            break;
                        default:
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar4 = this.f76062b;
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f.b bVar6 = fVar4.f49177b;
                            ArrayList arrayList2 = fVar4.f49183h;
                            if (bVar6 != null) {
                                q62.b bVar7 = (q62.b) f0Var;
                                bVar6.a((h0) arrayList2.get(bVar7.getBindingAdapterPosition()));
                                arrayList2.add((h0) arrayList2.get(bVar7.getBindingAdapterPosition()));
                                fVar4.notifyDataSetChanged();
                                bVar7.d();
                            }
                            break;
                    }
                }
            });
            final int i16 = 1;
            bVar.f143183i.setOnClickListener(new View.OnClickListener(this) { // from class: g62.b0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f f76062b;

                {
                    this.f76062b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i16) {
                        case 0:
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar = this.f76062b;
                            Context context2 = fVar.f49176a;
                            q62.b bVar2 = (q62.b) f0Var;
                            fVar.t(context2, bVar2, bVar2.getBindingAdapterPosition());
                            break;
                        case 1:
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar2 = this.f76062b;
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f.b bVar3 = fVar2.f49177b;
                            ArrayList arrayList = fVar2.f49183h;
                            if (bVar3 != null) {
                                q62.b bVar4 = (q62.b) f0Var;
                                bVar3.a((h0) arrayList.get(bVar4.getBindingAdapterPosition()));
                                arrayList.add((h0) arrayList.get(bVar4.getBindingAdapterPosition()));
                                fVar2.notifyDataSetChanged();
                                bVar4.d();
                            }
                            break;
                        case 2:
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar3 = this.f76062b;
                            Context context3 = fVar3.f49176a;
                            q62.b bVar5 = (q62.b) f0Var;
                            fVar3.t(context3, bVar5, bVar5.getBindingAdapterPosition());
                            break;
                        default:
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar4 = this.f76062b;
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f.b bVar6 = fVar4.f49177b;
                            ArrayList arrayList2 = fVar4.f49183h;
                            if (bVar6 != null) {
                                q62.b bVar7 = (q62.b) f0Var;
                                bVar6.a((h0) arrayList2.get(bVar7.getBindingAdapterPosition()));
                                arrayList2.add((h0) arrayList2.get(bVar7.getBindingAdapterPosition()));
                                fVar4.notifyDataSetChanged();
                                bVar7.d();
                            }
                            break;
                    }
                }
            });
            bVar.f143180f.setOnClickListener(new b0(this, i14, 4));
            bVar.f143180f.setOnLongClickListener(new v(1));
            final int i17 = 2;
            bVar.f143178d.setOnClickListener(new View.OnClickListener(this) { // from class: g62.b0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f f76062b;

                {
                    this.f76062b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i17) {
                        case 0:
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar = this.f76062b;
                            Context context2 = fVar.f49176a;
                            q62.b bVar2 = (q62.b) f0Var;
                            fVar.t(context2, bVar2, bVar2.getBindingAdapterPosition());
                            break;
                        case 1:
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar2 = this.f76062b;
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f.b bVar3 = fVar2.f49177b;
                            ArrayList arrayList = fVar2.f49183h;
                            if (bVar3 != null) {
                                q62.b bVar4 = (q62.b) f0Var;
                                bVar3.a((h0) arrayList.get(bVar4.getBindingAdapterPosition()));
                                arrayList.add((h0) arrayList.get(bVar4.getBindingAdapterPosition()));
                                fVar2.notifyDataSetChanged();
                                bVar4.d();
                            }
                            break;
                        case 2:
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar3 = this.f76062b;
                            Context context3 = fVar3.f49176a;
                            q62.b bVar5 = (q62.b) f0Var;
                            fVar3.t(context3, bVar5, bVar5.getBindingAdapterPosition());
                            break;
                        default:
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar4 = this.f76062b;
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f.b bVar6 = fVar4.f49177b;
                            ArrayList arrayList2 = fVar4.f49183h;
                            if (bVar6 != null) {
                                q62.b bVar7 = (q62.b) f0Var;
                                bVar6.a((h0) arrayList2.get(bVar7.getBindingAdapterPosition()));
                                arrayList2.add((h0) arrayList2.get(bVar7.getBindingAdapterPosition()));
                                fVar4.notifyDataSetChanged();
                                bVar7.d();
                            }
                            break;
                    }
                }
            });
            final int i18 = 3;
            bVar.f143186l.setOnClickListener(new View.OnClickListener(this) { // from class: g62.b0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f f76062b;

                {
                    this.f76062b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i18) {
                        case 0:
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar = this.f76062b;
                            Context context2 = fVar.f49176a;
                            q62.b bVar2 = (q62.b) f0Var;
                            fVar.t(context2, bVar2, bVar2.getBindingAdapterPosition());
                            break;
                        case 1:
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar2 = this.f76062b;
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f.b bVar3 = fVar2.f49177b;
                            ArrayList arrayList = fVar2.f49183h;
                            if (bVar3 != null) {
                                q62.b bVar4 = (q62.b) f0Var;
                                bVar3.a((h0) arrayList.get(bVar4.getBindingAdapterPosition()));
                                arrayList.add((h0) arrayList.get(bVar4.getBindingAdapterPosition()));
                                fVar2.notifyDataSetChanged();
                                bVar4.d();
                            }
                            break;
                        case 2:
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar3 = this.f76062b;
                            Context context3 = fVar3.f49176a;
                            q62.b bVar5 = (q62.b) f0Var;
                            fVar3.t(context3, bVar5, bVar5.getBindingAdapterPosition());
                            break;
                        default:
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar4 = this.f76062b;
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f.b bVar6 = fVar4.f49177b;
                            ArrayList arrayList2 = fVar4.f49183h;
                            if (bVar6 != null) {
                                q62.b bVar7 = (q62.b) f0Var;
                                bVar6.a((h0) arrayList2.get(bVar7.getBindingAdapterPosition()));
                                arrayList2.add((h0) arrayList2.get(bVar7.getBindingAdapterPosition()));
                                fVar4.notifyDataSetChanged();
                                bVar7.d();
                            }
                            break;
                    }
                }
            });
            bVar.f143184j.setOnSwipeOpenedListener(new u(this, i14, f0Var, 7));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        View viewE = e5.e(viewGroup, R.layout.gcm_swipeable_list_item, viewGroup, false);
        viewE.getClass();
        return new q62.b(viewE);
    }

    public final void r(WorkoutDetailsDTO workoutDetailsDTO, Map<Integer, com.garmin.android.apps.connectmobile.repcounting.model.c> map) {
        workoutDetailsDTO.getClass();
        map.getClass();
        this.f49182g = workoutDetailsDTO;
        this.f49185j = new LinkedHashMap(map);
        ArrayList arrayList = this.f49183h;
        arrayList.clear();
        Collection collection = workoutDetailsDTO.Q0;
        if (collection == null) {
            collection = j0.f134944a;
        }
        arrayList.addAll(collection);
        notifyDataSetChanged();
    }

    public final void t(Context context, q62.b bVar, int i14) {
        new androidx.appcompat.app.e.a(context).setTitle(R.string.lbl_workout_delete_leg).setMessage(R.string.msg_workout_delete_leg_confirm).setPositiveButton(R.string.lbl_delete, new ew1.k(this, i14, bVar, 2)).setNegativeButton(R.string.lbl_cancel, (DialogInterface.OnClickListener) null).show();
    }

    @Override // sq0.b
    public final int z1() {
        return this.f49183h.size();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/multisports/f$a;", "Lsq0/a;", "Lsq0/b;", "adapter", "<init>", "(Lsq0/b;)V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends sq0.a {
        static {
            new C0964a(null);
        }

        public a(sq0.b bVar) {
            super(bVar);
        }

        @Override // sq0.a
        public final int p() {
            return 900;
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/multisports/f$a$a;", "", "<init>", "()V", "", "TYPE_REORDERABLE_ITEM", "I", "TYPE_NOT_REORDERABLE_ITEM", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0964a {
            public /* synthetic */ C0964a(j jVar) {
                this();
            }

            private C0964a() {
            }
        }
    }

    public /* synthetic */ f(Context context, b bVar, sq0.e eVar, sq0.d dVar, p pVar, int i14, j jVar) {
        this(context, (i14 & 2) != 0 ? null : bVar, (i14 & 4) != 0 ? null : eVar, (i14 & 8) != 0 ? null : dVar, pVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14, List<? extends Object> list) {
        f0Var.getClass();
        list.getClass();
        if (f0Var instanceof q62.b) {
            if (!list.isEmpty()) {
                if (list.get(0) instanceof Boolean) {
                    ((q62.b) f0Var).d();
                    return;
                }
                return;
            }
            super.onBindViewHolder(f0Var, i14, list);
        }
    }
}
