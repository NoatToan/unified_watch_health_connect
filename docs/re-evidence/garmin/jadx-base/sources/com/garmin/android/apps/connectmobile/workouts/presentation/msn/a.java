package com.garmin.android.apps.connectmobile.workouts.presentation.msn;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.t;
import androidx.media3.common.z;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.l;
import androidx.media3.exoplayer.source.d;
import androidx.media3.exoplayer.v;
import androidx.media3.ui.PlayerView;
import bb.j;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.s2;
import com.garmin.android.apps.connectmobile.workouts.data.model.d0;
import com.garmin.android.apps.connectmobile.workouts.data.model.g;
import com.garmin.android.apps.connectmobile.workouts.data.model.o;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import fw.p;
import go1.g0;
import ha.i;
import i62.e;
import i62.f;
import i62.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p13.j0;
import p13.x;
import p13.y;
import tn.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment {
    public static final C0970a P = new C0970a(null);
    public long A;
    public boolean B;
    public boolean C;
    public boolean D;
    public s2 E;
    public e F;
    public String I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f49458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a4.b f49459b = new a4.b(this, 27);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f49460c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0 f49461d = new g0(this, 16);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinearLayout f49462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q62.c f49463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q62.c f49464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q62.c f49465h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public q62.c f49466i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f49467j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LinearLayout f49468k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f49469l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f49470m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public NestedScrollView f49471n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CollapsingToolbarLayout f49472o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinearLayout f49473p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public PlayerView f49474q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f49475r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f49476t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public v f49477v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public o f49478w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public i.b f49479x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public wa.e f49480y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f49481z;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f49482a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f49482a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/workouts/presentation/msn/a$c", "Landroidx/media3/common/z$d;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z.d {
        public c() {
        }

        @Override // androidx.media3.common.z.d
        public final void g1(PlaybackException playbackException) {
            playbackException.getClass();
            a aVar = a.this;
            View view2 = aVar.f49475r;
            if (view2 == null) {
                s.m("videoErrorLayout");
                throw null;
            }
            view2.setVisibility(0);
            PlayerView playerView = aVar.f49474q;
            if (playerView == null) {
                s.m("exoPlayerView");
                throw null;
            }
            playerView.setVisibility(8);
            LinearLayout linearLayout = aVar.f49473p;
            if (linearLayout != null) {
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                } else {
                    s.m("videoThumbnailContainerLayout");
                    throw null;
                }
            }
        }

        @Override // androidx.media3.common.z.d
        public final void onIsPlayingChanged(boolean z14) {
            a aVar = a.this;
            if (aVar.isAdded() && aVar.getResources().getConfiguration().orientation == 1) {
                CollapsingToolbarLayout collapsingToolbarLayout = aVar.f49472o;
                if (collapsingToolbarLayout == null) {
                    s.m("videoContainer");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams = collapsingToolbarLayout.getLayoutParams();
                layoutParams.getClass();
                AppBarLayout.LayoutParams layoutParams2 = (AppBarLayout.LayoutParams) layoutParams;
                PlayerView playerView = aVar.f49474q;
                if (playerView == null) {
                    s.m("exoPlayerView");
                    throw null;
                }
                z player = playerView.getPlayer();
                boolean playWhenReady = player != null ? player.getPlayWhenReady() : false;
                if (z14) {
                    String str = aVar.I;
                    if (str != null) {
                        ht.a aVar2 = ht.a.f85464a;
                        Bundle bundleA = h7.c.a(new o13.p("MSNVideoUri", str));
                        aVar2.getClass();
                        ht.a.a(bundleA, "MSNVideoPlayed");
                    }
                    layoutParams2.setScrollFlags(0);
                } else if (playWhenReady) {
                    layoutParams2.setScrollFlags(0);
                } else {
                    layoutParams2.setScrollFlags(5);
                }
                CollapsingToolbarLayout collapsingToolbarLayout2 = aVar.f49472o;
                if (collapsingToolbarLayout2 != null) {
                    collapsingToolbarLayout2.setLayoutParams(layoutParams2);
                } else {
                    s.m("videoContainer");
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        this.E = (s2) context;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Context context;
        super.onCreate(bundle);
        setRetainInstance(true);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("GCM_workout_exercise_category");
            String string2 = arguments.getString("GCM_workout_exercise_name");
            boolean z14 = arguments.getBoolean("GCM_workout_exercise_has_details");
            this.f49458a = z14;
            if (string != null && string2 != null && z14 && (context = getContext()) != null) {
                Resources resources = context.getResources();
                resources.getClass();
                this.F = (e) new x1(this, new f(n.a(resources), string, string2)).b(s0.f105811a.b(e.class));
            }
        }
        i.b bVar = new i.b();
        bVar.f82606c = fa.z.D(requireContext(), getString(R.string.launcher_name_garmin_connect));
        bVar.f82607d = 8000;
        bVar.f82608e = 8000;
        this.f49479x = bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        if (this.f49458a) {
            View viewInflate = layoutInflater.inflate(R.layout.gcm4_fragment_msn_workout_exercise, viewGroup, false);
            viewInflate.getClass();
            return viewInflate;
        }
        View viewInflate2 = layoutInflater.inflate(R.layout.gcm4_msn_workout_exercise_no_details, viewGroup, false);
        viewInflate2.getClass();
        return viewInflate2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (fa.z.f70071a <= 23) {
            v6();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (fa.z.f70071a <= 23 || this.f49477v == null) {
            u6(this.B);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (fa.z.f70071a > 23) {
            u6(this.B);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (fa.z.f70071a > 23) {
            v6();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        if (this.f49458a) {
            if (getResources().getConfiguration().orientation == 1) {
                View viewFindViewById = view2.findViewById(R.id.msn_exercise_key_features);
                viewFindViewById.getClass();
                this.f49462e = (LinearLayout) viewFindViewById;
                View viewFindViewById2 = view2.findViewById(R.id.msn_exercise_difficulty);
                viewFindViewById2.getClass();
                this.f49463f = new q62.c(viewFindViewById2);
                View viewFindViewById3 = view2.findViewById(R.id.msn_exercise_focus);
                viewFindViewById3.getClass();
                this.f49464g = new q62.c(viewFindViewById3);
                View viewFindViewById4 = view2.findViewById(R.id.msn_exercise_muscle_groups);
                viewFindViewById4.getClass();
                this.f49465h = new q62.c(viewFindViewById4);
                View viewFindViewById5 = view2.findViewById(R.id.msn_exercise_equipment);
                viewFindViewById5.getClass();
                this.f49466i = new q62.c(viewFindViewById5);
                View viewFindViewById6 = view2.findViewById(R.id.steps_container);
                viewFindViewById6.getClass();
                this.f49467j = (LinearLayout) viewFindViewById6;
                View viewFindViewById7 = view2.findViewById(R.id.tips_container);
                viewFindViewById7.getClass();
                this.f49468k = (LinearLayout) viewFindViewById7;
                View viewFindViewById8 = view2.findViewById(R.id.msn_exercise_tips);
                viewFindViewById8.getClass();
                this.f49469l = (TextView) viewFindViewById8;
                View viewFindViewById9 = view2.findViewById(R.id.msn_exercise_tips_lbl);
                viewFindViewById9.getClass();
                this.f49470m = (TextView) viewFindViewById9;
                View viewFindViewById10 = view2.findViewById(R.id.msn_exercise_root_layout);
                viewFindViewById10.getClass();
                this.f49471n = (NestedScrollView) viewFindViewById10;
                View viewFindViewById11 = view2.findViewById(R.id.msn_exercise_videos_thumbnail_container);
                viewFindViewById11.getClass();
                this.f49473p = (LinearLayout) viewFindViewById11;
                View viewFindViewById12 = view2.findViewById(R.id.msn_exercise_video);
                viewFindViewById12.getClass();
                this.f49472o = (CollapsingToolbarLayout) viewFindViewById12;
            }
            View viewFindViewById13 = view2.findViewById(R.id.msn_exercise_video_error);
            viewFindViewById13.getClass();
            this.f49475r = viewFindViewById13;
            View viewFindViewById14 = view2.findViewById(R.id.msn_exercise_player_view);
            viewFindViewById14.getClass();
            PlayerView playerView = (PlayerView) viewFindViewById14;
            this.f49474q = playerView;
            playerView.requestFocus();
            e eVar = this.F;
            if (eVar != null) {
                y0 y0Var = new y0();
                ge1.b.T(eVar, null, null, new i62.c(eVar, y0Var, null), 3);
                y0Var.f(getViewLifecycleOwner(), this.f49459b);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        y6();
        this.B = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z14) {
        super.setUserVisibleHint(z14);
        if (!z14) {
            v vVar = this.f49477v;
            if (vVar != null) {
                vVar.setPlayWhenReady(false);
                return;
            }
            return;
        }
        if (this.C) {
            s2 s2Var = this.E;
            if (s2Var == null) {
                s.m("progressOverlayListener");
                throw null;
            }
            s2Var.showProgressOverlay();
        }
        if (this.D) {
            w6();
        }
    }

    public final void u6(boolean z14) {
        if (this.f49458a) {
            v6();
            wa.a.b bVar = new wa.a.b();
            l lVar = new l(requireContext());
            this.f49480y = new wa.e(requireContext(), bVar);
            ExoPlayer.b bVar2 = new ExoPlayer.b(requireContext(), lVar);
            wa.e eVar = this.f49480y;
            eVar.getClass();
            bVar2.b(eVar);
            v vVarA = bVar2.a();
            this.f49477v = vVarA;
            vVarA.e(this.f49460c);
            PlayerView playerView = this.f49474q;
            if (playerView == null) {
                s.m("exoPlayerView");
                throw null;
            }
            v vVar = this.f49477v;
            if (vVar == null) {
                s.m("player");
                throw null;
            }
            playerView.setPlayer(vVar);
            o oVar = this.f49478w;
            if (oVar != null) {
                ArrayList arrayList = new ArrayList();
                List<d0> listK = oVar.k();
                if (listK != null) {
                    int i14 = 0;
                    for (Object obj : listK) {
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            x.q();
                            throw null;
                        }
                        j jVar = new j();
                        String strG = k.g(n.c(), ((d0) obj).getCom.google.android.exoplayer2.util.MimeTypes.BASE_TYPE_VIDEO java.lang.String());
                        if (i14 == 0) {
                            this.I = strG;
                        }
                        i.b bVar3 = this.f49479x;
                        if (bVar3 != null) {
                            androidx.media3.exoplayer.source.p.b bVar4 = new androidx.media3.exoplayer.source.p.b(bVar3, jVar);
                            t.c cVar = new t.c();
                            cVar.f8447b = Uri.parse(strG);
                            arrayList.add(bVar4.b(cVar.a()));
                        }
                        i14 = i15;
                    }
                }
                androidx.media3.exoplayer.source.j[] jVarArr = (androidx.media3.exoplayer.source.j[]) arrayList.toArray(new androidx.media3.exoplayer.source.j[0]);
                d dVar = new d((androidx.media3.exoplayer.source.j[]) Arrays.copyOf(jVarArr, jVarArr.length));
                v vVar2 = this.f49477v;
                if (vVar2 == null) {
                    s.m("player");
                    throw null;
                }
                vVar2.f(dVar);
                v vVar3 = this.f49477v;
                if (vVar3 == null) {
                    s.m("player");
                    throw null;
                }
                vVar3.prepare();
                v vVar4 = this.f49477v;
                if (vVar4 == null) {
                    s.m("player");
                    throw null;
                }
                vVar4.i(this.A, this.f49481z, false);
                if (z14 && getUserVisibleHint()) {
                    v vVar5 = this.f49477v;
                    if (vVar5 == null) {
                        s.m("player");
                        throw null;
                    }
                    vVar5.setPlayWhenReady(true);
                }
            }
        }
    }

    public final void v6() {
        v vVar = this.f49477v;
        if (vVar != null) {
            this.B = vVar.getPlayWhenReady();
            v vVar2 = this.f49477v;
            if (vVar2 == null) {
                s.m("player");
                throw null;
            }
            this.f49481z = vVar2.getCurrentMediaItemIndex();
            v vVar3 = this.f49477v;
            if (vVar3 == null) {
                s.m("player");
                throw null;
            }
            this.A = vVar3.getCurrentPosition();
            v vVar4 = this.f49477v;
            if (vVar4 == null) {
                s.m("player");
                throw null;
            }
            vVar4.release();
            this.f49480y = null;
        }
    }

    public final void w6() {
        Toast.makeText(getActivity(), R.string.txt_error_occurred, 0).show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v48, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v53, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r9v11 */
    public final void y6() {
        String focuses;
        String bodyParts;
        String equipment;
        ?? arrayList;
        Object next;
        o oVar = this.f49478w;
        if (oVar != null) {
            if (getResources().getConfiguration().orientation == 1) {
                String difficulty = oVar.getDifficulty();
                if ((difficulty == null || difficulty.length() == 0) && (((focuses = oVar.getFocuses()) == null || focuses.length() == 0) && (((bodyParts = oVar.getBodyParts()) == null || bodyParts.length() == 0) && ((equipment = oVar.getEquipment()) == null || equipment.length() == 0)))) {
                    LinearLayout linearLayout = this.f49462e;
                    if (linearLayout == null) {
                        s.m("keyFeaturesContainerLayout");
                        throw null;
                    }
                    linearLayout.setVisibility(8);
                } else {
                    LinearLayout linearLayout2 = this.f49462e;
                    if (linearLayout2 == null) {
                        s.m("keyFeaturesContainerLayout");
                        throw null;
                    }
                    linearLayout2.setVisibility(0);
                    String difficulty2 = oVar.getDifficulty();
                    if (difficulty2 == null || difficulty2.length() == 0) {
                        q62.c cVar = this.f49463f;
                        if (cVar == null) {
                            s.m("difficultyViewHolder");
                            throw null;
                        }
                        cVar.f143192a.setVisibility(8);
                    } else {
                        q62.c cVar2 = this.f49463f;
                        if (cVar2 == null) {
                            s.m("difficultyViewHolder");
                            throw null;
                        }
                        cVar2.f143192a.setVisibility(0);
                        q62.c cVar3 = this.f49463f;
                        if (cVar3 == null) {
                            s.m("difficultyViewHolder");
                            throw null;
                        }
                        cVar3.a(oVar.getDifficulty(), getString(R.string.common_difficulty));
                    }
                    String focuses2 = oVar.getFocuses();
                    if (focuses2 == null || focuses2.length() == 0) {
                        q62.c cVar4 = this.f49464g;
                        if (cVar4 == null) {
                            s.m("focusViewHolder");
                            throw null;
                        }
                        cVar4.f143192a.setVisibility(8);
                    } else {
                        q62.c cVar5 = this.f49464g;
                        if (cVar5 == null) {
                            s.m("focusViewHolder");
                            throw null;
                        }
                        cVar5.f143192a.setVisibility(0);
                        q62.c cVar6 = this.f49464g;
                        if (cVar6 == null) {
                            s.m("focusViewHolder");
                            throw null;
                        }
                        cVar6.a(oVar.getFocuses(), getString(R.string.lbl_msn_workout_exercise_focus));
                    }
                    List<String> listI = oVar.i();
                    if (listI == null || listI.isEmpty()) {
                        q62.c cVar7 = this.f49465h;
                        if (cVar7 == null) {
                            s.m("muscleViewHolder");
                            throw null;
                        }
                        cVar7.f143192a.setVisibility(8);
                    } else {
                        List<String> listI2 = oVar.i();
                        if (listI2 != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (String str : listI2) {
                                w13.c cVar8 = zw1.a.f207224y;
                                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar8, cVar8);
                                do {
                                    if (!bVarN.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = bVarN.next();
                                } while (!s.g(((zw1.a) next).name(), str));
                                zw1.a aVar = (zw1.a) next;
                                if (aVar != null) {
                                    arrayList2.add(aVar);
                                }
                            }
                            arrayList = new ArrayList(y.r(arrayList2, 10));
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(requireContext().getString(((zw1.a) it.next()).f207226b));
                            }
                        } else {
                            arrayList = j0.f134944a;
                        }
                        boolean zIsEmpty = ((Collection) arrayList).isEmpty();
                        q62.c cVar9 = this.f49465h;
                        if (zIsEmpty) {
                            if (cVar9 == null) {
                                s.m("muscleViewHolder");
                                throw null;
                            }
                            cVar9.f143192a.setVisibility(8);
                        } else {
                            if (cVar9 == null) {
                                s.m("muscleViewHolder");
                                throw null;
                            }
                            cVar9.f143192a.setVisibility(0);
                            String strK0 = h0.k0((Iterable) arrayList, null, null, null, null, 63);
                            q62.c cVar10 = this.f49465h;
                            if (cVar10 == null) {
                                s.m("muscleViewHolder");
                                throw null;
                            }
                            cVar10.a(strK0, getString(R.string.lbl_primary_muscle_groups));
                        }
                    }
                    String equipment2 = oVar.getEquipment();
                    String string = (equipment2 == null || equipment2.length() == 0) ? getString(R.string.lbl_none) : oVar.getEquipment();
                    q62.c cVar11 = this.f49466i;
                    if (cVar11 == null) {
                        s.m("equipmentViewHolder");
                        throw null;
                    }
                    cVar11.a(string, getString(R.string.lbl_workout_exercise_equipment));
                }
                LinearLayout linearLayout3 = this.f49467j;
                if (linearLayout3 == null) {
                    s.m("stepsContainerLayout");
                    throw null;
                }
                LinearLayout linearLayout4 = this.f49462e;
                if (linearLayout4 == null) {
                    s.m("keyFeaturesContainerLayout");
                    throw null;
                }
                int iIndexOfChild = linearLayout3.indexOfChild(linearLayout4);
                LinearLayout linearLayout5 = this.f49467j;
                if (linearLayout5 == null) {
                    s.m("stepsContainerLayout");
                    throw null;
                }
                LinearLayout linearLayout6 = this.f49468k;
                if (linearLayout6 == null) {
                    s.m("tipsContainerLayout");
                    throw null;
                }
                int iIndexOfChild2 = linearLayout5.indexOfChild(linearLayout6);
                LinearLayout linearLayout7 = this.f49467j;
                if (linearLayout7 == null) {
                    s.m("stepsContainerLayout");
                    throw null;
                }
                linearLayout7.removeViews(iIndexOfChild + 1, (iIndexOfChild2 - iIndexOfChild) - 1);
                List<g> listG = oVar.g();
                if (listG != null) {
                    int i14 = 0;
                    for (Object obj : listG) {
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            x.q();
                            throw null;
                        }
                        g gVar = (g) obj;
                        LayoutInflater layoutInflater = getLayoutInflater();
                        LinearLayout linearLayout8 = this.f49467j;
                        if (linearLayout8 == null) {
                            s.m("stepsContainerLayout");
                            throw null;
                        }
                        View viewInflate = layoutInflater.inflate(R.layout.gcm4_msn_workout_exercise_step_item, (ViewGroup) linearLayout8, false);
                        ((TextView) viewInflate.findViewById(R.id.msn_exercise_step_title)).setText(getString(R.string.lbl_msn_workout_exercise_step, Integer.valueOf(i15)));
                        ((TextView) viewInflate.findViewById(R.id.msn_exercise_step_description)).setText(gVar.getInstructions());
                        LinearLayout linearLayout9 = this.f49467j;
                        if (linearLayout9 == null) {
                            s.m("stepsContainerLayout");
                            throw null;
                        }
                        linearLayout9.addView(viewInflate, iIndexOfChild + i15);
                        i14 = i15;
                    }
                    Unit unit = Unit.INSTANCE;
                }
                List<String> listJ = oVar.j();
                String strK1 = listJ != null ? h0.k0(listJ, " \n", null, null, null, 62) : null;
                if (strK1 == null || strK1.length() == 0) {
                    TextView textView = this.f49470m;
                    if (textView == null) {
                        s.m("tipsLabel");
                        throw null;
                    }
                    textView.setVisibility(8);
                    TextView textView2 = this.f49469l;
                    if (textView2 == null) {
                        s.m("tipsTextView");
                        throw null;
                    }
                    textView2.setText("");
                } else {
                    TextView textView3 = this.f49470m;
                    if (textView3 == null) {
                        s.m("tipsLabel");
                        throw null;
                    }
                    textView3.setVisibility(0);
                    TextView textView4 = this.f49469l;
                    if (textView4 == null) {
                        s.m("tipsTextView");
                        throw null;
                    }
                    textView4.setText(strK1);
                }
                NestedScrollView nestedScrollView = this.f49471n;
                if (nestedScrollView == null) {
                    s.m("rootLayout");
                    throw null;
                }
                nestedScrollView.setVisibility(0);
                List<d0> listK = oVar.k();
                if (listK != null) {
                    CollapsingToolbarLayout collapsingToolbarLayout = this.f49472o;
                    if (collapsingToolbarLayout == null) {
                        s.m("videoContainer");
                        throw null;
                    }
                    collapsingToolbarLayout.setVisibility(listK.isEmpty() ? 8 : 0);
                    if (listK.size() > 1) {
                        LinearLayout linearLayout10 = this.f49473p;
                        if (linearLayout10 == null) {
                            s.m("videoThumbnailContainerLayout");
                            throw null;
                        }
                        linearLayout10.removeAllViews();
                        int i16 = 0;
                        for (Object obj2 : listK) {
                            int i17 = i16 + 1;
                            if (i16 < 0) {
                                x.q();
                                throw null;
                            }
                            d0 d0Var = (d0) obj2;
                            LayoutInflater layoutInflater2 = getLayoutInflater();
                            NestedScrollView nestedScrollView2 = this.f49471n;
                            if (nestedScrollView2 == null) {
                                s.m("rootLayout");
                                throw null;
                            }
                            View viewInflate2 = layoutInflater2.inflate(R.layout.gcm4_msn_workout_video_thumbnail, (ViewGroup) nestedScrollView2, false);
                            viewInflate2.getClass();
                            ImageView imageView = (ImageView) viewInflate2;
                            String strG = k.g(n.c(), d0Var.getThumbnail());
                            imageView.setTag(R.id.tag_key_thumbnail_index, Integer.valueOf(i16));
                            imageView.setOnClickListener(this.f49461d);
                            Context context = imageView.getContext();
                            context.getClass();
                            zp0.c cVar12 = new zp0.c(context);
                            cVar12.f206577q = true;
                            cVar12.f206565e = strG;
                            cVar12.h(imageView);
                            LinearLayout linearLayout11 = this.f49473p;
                            if (linearLayout11 == null) {
                                s.m("videoThumbnailContainerLayout");
                                throw null;
                            }
                            linearLayout11.addView(imageView);
                            i16 = i17;
                        }
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
            }
            Unit unit3 = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.msn.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/a$a;", "", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0970a {
        public /* synthetic */ C0970a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0970a() {
        }
    }
}
