package androidx.media3.ui;

import ab.k;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SurfaceSyncGroup;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.d0;
import androidx.media3.common.h0;
import androidx.media3.common.k0;
import androidx.media3.common.m;
import androidx.media3.common.z;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.ui.PlayerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.common.collect.ImmutableList;
import h0.r0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k32.n;
import kc.h;

/* JADX INFO: loaded from: classes.dex */
public class PlayerView extends FrameLayout implements androidx.media3.common.c {
    public static final /* synthetic */ int H0 = 0;
    public Drawable A;
    public int B;
    public boolean C;
    public m<? super PlaybackException> D;
    public CharSequence E;
    public int F;
    public boolean I;
    public boolean P;
    public boolean T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f9953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AspectRatioFrameLayout f9954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f9955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f9956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f9958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f9959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f9960h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SubtitleView f9961i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f9962j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TextView f9963k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f9964k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final androidx.media3.ui.c f9965l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final FrameLayout f9966m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final FrameLayout f9967n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Handler f9968o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Class<?> f9969p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Method f9970q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f9971r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public z f9972t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f9973v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c f9974w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public androidx.media3.ui.c.m f9975x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f9976y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f9977z;

    public final class b implements z.d, View.OnClickListener, androidx.media3.ui.c.m, androidx.media3.ui.c.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d0.b f9978a = new d0.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f9979b;

        public b() {
        }

        @Override // androidx.media3.common.z.d
        public final void a6(int i14, z.e eVar, z.e eVar2) {
            androidx.media3.ui.c cVar;
            int i15 = PlayerView.H0;
            PlayerView playerView = PlayerView.this;
            if (playerView.d() && playerView.P && (cVar = playerView.f9965l) != null) {
                cVar.f();
            }
        }

        @Override // androidx.media3.common.z.d
        public final void g2(h0 h0Var) {
            PlayerView playerView = PlayerView.this;
            z zVar = playerView.f9972t;
            zVar.getClass();
            d0 currentTimeline = zVar.isCommandAvailable(17) ? zVar.getCurrentTimeline() : d0.f8186a;
            if (currentTimeline.p()) {
                this.f9979b = null;
            } else {
                boolean zIsCommandAvailable = zVar.isCommandAvailable(30);
                d0.b bVar = this.f9978a;
                if (!zIsCommandAvailable || zVar.g().f8302a.isEmpty()) {
                    Object obj = this.f9979b;
                    if (obj != null) {
                        int iB = currentTimeline.b(obj);
                        if (iB != -1) {
                            if (zVar.getCurrentMediaItemIndex() == currentTimeline.f(iB, bVar, false).f8189c) {
                                return;
                            }
                        }
                        this.f9979b = null;
                    }
                } else {
                    this.f9979b = currentTimeline.f(zVar.getCurrentPeriodIndex(), bVar, true).f8188b;
                }
            }
            playerView.n(false);
        }

        @Override // androidx.media3.common.z.d
        public final void k(k0 k0Var) {
            PlayerView playerView;
            z zVar;
            if (k0Var.equals(k0.f8334d) || (zVar = (playerView = PlayerView.this).f9972t) == null || zVar.getPlaybackState() == 1) {
                return;
            }
            playerView.j();
        }

        @Override // androidx.media3.common.z.d
        public final void n(ea.b bVar) {
            SubtitleView subtitleView = PlayerView.this.f9961i;
            if (subtitleView != null) {
                subtitleView.setCues(bVar.f63586a);
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            int i14 = PlayerView.H0;
            PlayerView.this.i();
        }

        @Override // androidx.media3.common.z.d
        public final void onPlayWhenReadyChanged(boolean z14, int i14) {
            int i15 = PlayerView.H0;
            PlayerView playerView = PlayerView.this;
            playerView.k();
            if (!playerView.d() || !playerView.P) {
                playerView.e(false);
                return;
            }
            androidx.media3.ui.c cVar = playerView.f9965l;
            if (cVar != null) {
                cVar.f();
            }
        }

        @Override // androidx.media3.common.z.d
        public final void onPlaybackStateChanged(int i14) {
            int i15 = PlayerView.H0;
            PlayerView playerView = PlayerView.this;
            playerView.k();
            playerView.m();
            if (!playerView.d() || !playerView.P) {
                playerView.e(false);
                return;
            }
            androidx.media3.ui.c cVar = playerView.f9965l;
            if (cVar != null) {
                cVar.f();
            }
        }

        @Override // androidx.media3.common.z.d
        public final void onRenderedFirstFrame() {
            PlayerView playerView = PlayerView.this;
            View view2 = playerView.f9955c;
            if (view2 != null) {
                view2.setVisibility(4);
                if (!playerView.b()) {
                    playerView.c();
                    return;
                }
                ImageView imageView = playerView.f9959g;
                if (imageView != null) {
                    imageView.setVisibility(4);
                }
            }
        }

        @Override // androidx.media3.common.z.d
        public final void onSurfaceSizeChanged(int i14, int i15) {
            if (fa.z.f70071a == 34) {
                PlayerView playerView = PlayerView.this;
                if ((playerView.f9956d instanceof SurfaceView) && playerView.f9964k0) {
                    e eVar = playerView.f9958f;
                    eVar.getClass();
                    playerView.f9968o.post(new fh2.a(eVar, 12, (SurfaceView) playerView.f9956d, new n(playerView, 4)));
                }
            }
        }

        @Override // androidx.media3.ui.c.m
        public final void onVisibilityChange(int i14) {
            int i15 = PlayerView.H0;
            PlayerView playerView = PlayerView.this;
            playerView.l();
            c cVar = playerView.f9974w;
            if (cVar != null) {
                cVar.a(i14);
            }
        }
    }

    public interface c {
        void a(int i14);
    }

    public interface d {
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SurfaceSyncGroup f9981a;

        private e() {
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r3v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v1 ??, new type: android.view.View
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v1 ??, new type: android.view.View
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v38 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v38 ??, new type: androidx.media3.ui.PlayerView$a
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v38 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v38 ??, new type: androidx.media3.ui.PlayerView$a
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 8 more
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: TypeSearchVarInfo not found in map for var: r6v0 ??
    	at jadx.core.dex.visitors.typeinference.TypeSearchState.getVarInfo(TypeSearchState.java:34)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.lambda$resolveIndependentVariables$1(TypeSearch.java:173)
    	at java.base/java.util.stream.MatchOps$1MatchSink.accept(MatchOps.java:90)
    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.test(ReferencePipeline.java:306)
    	at java.base/java.util.stream.MatchOps$1MatchSink.accept(MatchOps.java:90)
    	at java.base/java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1701)
    	at java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:147)
    	at java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:588)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:574)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
    	at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:230)
    	at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:196)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
    	at java.base/java.util.stream.ReferencePipeline.allMatch(ReferencePipeline.java:673)
    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.accept(ReferencePipeline.java:291)
    	at java.base/java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1701)
    	at java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:147)
    	at java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:588)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:574)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
    	at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:230)
    	at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:196)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
    	at java.base/java.util.stream.ReferencePipeline.allMatch(ReferencePipeline.java:673)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.resolveIndependentVariables(TypeSearch.java:173)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:63)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Type inference failed for: r21v0, types: [android.view.View, android.view.ViewGroup, androidx.media3.ui.PlayerView] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.media3.ui.PlayerView$a] */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v6 */
    public PlayerView(Context context, AttributeSet attributeSet, int i14) {
        int i15;
        int i16;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        boolean z18;
        boolean z19;
        int i27;
        boolean z24;
        ?? r14;
        Class<ExoPlayer> cls;
        Object objNewProxyInstance;
        Method method;
        int i28;
        super(context, attributeSet, i14);
        b bVar = new b();
        this.f9953a = bVar;
        this.f9968o = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.f9954b = null;
            this.f9955c = null;
            this.f9956d = null;
            this.f9957e = false;
            this.f9958f = null;
            this.f9959g = null;
            this.f9960h = null;
            this.f9961i = null;
            this.f9962j = null;
            this.f9963k = null;
            this.f9965l = null;
            this.f9966m = null;
            this.f9967n = null;
            this.f9969p = null;
            this.f9970q = null;
            this.f9971r = null;
            ImageView imageView = new ImageView(context);
            if (fa.z.f70071a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(resources.getDrawable(2131231655, context.getTheme()));
                imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(resources2.getDrawable(2131231655, context.getTheme()));
                imageView.setBackgroundColor(resources2.getColor(R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, h.f103895d, i14, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(42);
                int color = typedArrayObtainStyledAttributes.getColor(42, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(22, R.layout.exo_player_view);
                boolean z25 = typedArrayObtainStyledAttributes.getBoolean(49, true);
                int i29 = typedArrayObtainStyledAttributes.getInt(3, 1);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(9, 0);
                int i30 = typedArrayObtainStyledAttributes.getInt(15, 0);
                boolean z26 = typedArrayObtainStyledAttributes.getBoolean(50, true);
                int i34 = typedArrayObtainStyledAttributes.getInt(45, 1);
                int i35 = typedArrayObtainStyledAttributes.getInt(28, 0);
                z14 = z26;
                i15 = typedArrayObtainStyledAttributes.getInt(38, 5000);
                boolean z27 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                boolean z28 = typedArrayObtainStyledAttributes.getBoolean(4, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(35, 0);
                this.C = typedArrayObtainStyledAttributes.getBoolean(16, this.C);
                boolean z29 = typedArrayObtainStyledAttributes.getBoolean(13, true);
                typedArrayObtainStyledAttributes.recycle();
                z17 = z29;
                z15 = z27;
                z19 = z25;
                i26 = color;
                i16 = resourceId;
                i18 = resourceId2;
                i24 = i35;
                z16 = z28;
                i17 = integer;
                i27 = i29;
                z18 = zHasValue;
                i25 = i34;
                i19 = i30;
            } catch (Throwable th3) {
                typedArrayObtainStyledAttributes.recycle();
                throw th3;
            }
        } else {
            i15 = 5000;
            i16 = R.layout.exo_player_view;
            z14 = true;
            z15 = true;
            z16 = true;
            z17 = true;
            i17 = 0;
            i18 = 0;
            i19 = 0;
            i24 = 0;
            i25 = 1;
            i26 = 0;
            z18 = false;
            z19 = true;
            i27 = 1;
        }
        LayoutInflater.from(context).inflate(i16, (ViewGroup) this);
        setDescendantFocusability(GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.f9954b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i24);
        }
        View viewFindViewById = findViewById(R.id.exo_shutter);
        this.f9955c = viewFindViewById;
        if (viewFindViewById != null && z18) {
            viewFindViewById.setBackgroundColor(i26);
        }
        if (aspectRatioFrameLayout == null || i25 == 0) {
            ?? r15 = r6;
            this.f9956d = r15;
            z24 = false;
            r14 = r15;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i25 != 2) {
                if (i25 == 3) {
                    try {
                        int i36 = k.f2478l;
                        this.f9956d = (View) k.class.getConstructor(Context.class).newInstance(context);
                        z24 = true;
                    } catch (Exception e4) {
                        com.airbnb.lottie.animation.keyframe.a.x("spherical_gl_surface_view requires an ExoPlayer dependency", e4);
                        throw r6;
                    }
                } else if (i25 != 4) {
                    SurfaceView surfaceView = new SurfaceView(context);
                    if (fa.z.f70071a >= 34) {
                        surfaceView.setSurfaceLifecycle(2);
                    }
                    this.f9956d = surfaceView;
                } else {
                    try {
                        int i37 = za.d.f203179b;
                        this.f9956d = (View) za.d.class.getConstructor(Context.class).newInstance(context);
                    } catch (Exception e14) {
                        com.airbnb.lottie.animation.keyframe.a.x("video_decoder_gl_surface_view requires an ExoPlayer dependency", e14);
                        throw 0;
                    }
                }
                this.f9956d.setLayoutParams(layoutParams);
                this.f9956d.setOnClickListener(bVar);
                this.f9956d.setClickable(false);
                aspectRatioFrameLayout.addView(this.f9956d, 0);
                r14 = r6;
            } else {
                this.f9956d = new TextureView(context);
            }
            z24 = false;
            this.f9956d.setLayoutParams(layoutParams);
            this.f9956d.setOnClickListener(bVar);
            this.f9956d.setClickable(false);
            aspectRatioFrameLayout.addView(this.f9956d, 0);
            r14 = r6;
        }
        this.f9957e = z24;
        this.f9958f = fa.z.f70071a == 34 ? new e() : null;
        this.f9966m = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.f9967n = (FrameLayout) findViewById(R.id.exo_overlay);
        this.f9959g = (ImageView) findViewById(R.id.exo_image);
        this.f9977z = i19;
        try {
            cls = ExoPlayer.class;
            ImageOutput.a aVar = ImageOutput.f9170a;
            method = cls.getMethod("setImageOutput", ImageOutput.class);
            objNewProxyInstance = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new InvocationHandler() { // from class: kc.g
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) {
                    int i38 = PlayerView.H0;
                    if (!method2.getName().equals("onImageAvailable")) {
                        return null;
                    }
                    Bitmap bitmap = (Bitmap) objArr[1];
                    PlayerView playerView = this.f103891a;
                    playerView.f9968o.post(new r0(29, playerView, bitmap));
                    return null;
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            objNewProxyInstance = null;
            method = null;
        }
        this.f9969p = cls;
        this.f9970q = method;
        this.f9971r = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.f9960h = imageView2;
        this.f9976y = (!z19 || i27 == 0 || imageView2 == null) ? 0 : i27;
        if (i18 != 0) {
            this.A = a7.b.getDrawable(getContext(), i18);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.f9961i = subtitleView;
        if (subtitleView != null) {
            subtitleView.a();
            subtitleView.b();
        }
        View viewFindViewById2 = findViewById(R.id.exo_buffering);
        this.f9962j = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.B = i17;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.f9963k = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        androidx.media3.ui.c cVar = (androidx.media3.ui.c) findViewById(R.id.exo_controller);
        View viewFindViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (cVar != null) {
            this.f9965l = cVar;
            i28 = 0;
        } else if (viewFindViewById3 != null) {
            i28 = 0;
            androidx.media3.ui.c cVar2 = new androidx.media3.ui.c(context, null, 0, attributeSet);
            this.f9965l = cVar2;
            cVar2.setId(R.id.exo_controller);
            cVar2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(cVar2, iIndexOfChild);
        } else {
            i28 = 0;
            this.f9965l = null;
        }
        androidx.media3.ui.c cVar3 = this.f9965l;
        this.F = cVar3 != null ? i15 : i28;
        this.T = z15;
        this.I = z16;
        this.P = z17;
        this.f9973v = (!z14 || cVar3 == null) ? i28 : 1;
        if (cVar3 != null) {
            kc.f fVar = cVar3.f10037a;
            int i38 = fVar.f103878z;
            if (i38 != 3 && i38 != 2) {
                fVar.f();
                fVar.i(2);
            }
            androidx.media3.ui.c cVar4 = this.f9965l;
            b bVar2 = this.f9953a;
            cVar4.getClass();
            bVar2.getClass();
            cVar4.f10043d.add(bVar2);
        }
        if (z14) {
            setClickable(true);
        }
        l();
    }

    public static void a(PlayerView playerView, Bitmap bitmap) {
        playerView.setImage(new BitmapDrawable(playerView.getResources(), bitmap));
        z zVar = playerView.f9972t;
        if (zVar != null && zVar.isCommandAvailable(30) && zVar.g().b(2)) {
            return;
        }
        ImageView imageView = playerView.f9959g;
        if (imageView != null) {
            imageView.setVisibility(0);
            playerView.o();
        }
        View view2 = playerView.f9955c;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.f9959g;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        o();
    }

    private void setImageOutput(z zVar) {
        Class<?> cls = this.f9969p;
        if (cls == null || !cls.isAssignableFrom(zVar.getClass())) {
            return;
        }
        try {
            Method method = this.f9970q;
            method.getClass();
            Object obj = this.f9971r;
            obj.getClass();
            method.invoke(zVar, obj);
        } catch (IllegalAccessException | InvocationTargetException e4) {
            o2.c.p(e4);
        }
    }

    public final boolean b() {
        z zVar = this.f9972t;
        return zVar != null && this.f9971r != null && zVar.isCommandAvailable(30) && zVar.g().b(4);
    }

    public final void c() {
        ImageView imageView = this.f9959g;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
        }
    }

    public final boolean d() {
        z zVar = this.f9972t;
        return zVar != null && zVar.isCommandAvailable(16) && this.f9972t.isPlayingAd() && this.f9972t.getPlayWhenReady();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        e eVar;
        SurfaceSyncGroup surfaceSyncGroup;
        super.dispatchDraw(canvas);
        if (fa.z.f70071a != 34 || (eVar = this.f9958f) == null || !this.f9964k0 || (surfaceSyncGroup = eVar.f9981a) == null) {
            return;
        }
        surfaceSyncGroup.markSyncReady();
        eVar.f9981a = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        z zVar = this.f9972t;
        if (zVar != null && zVar.isCommandAvailable(16) && this.f9972t.isPlayingAd()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z14 = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        androidx.media3.ui.c cVar = this.f9965l;
        if (z14 && p() && !cVar.g()) {
            e(true);
            return true;
        }
        if ((p() && cVar.c(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            e(true);
            return true;
        }
        if (z14 && p()) {
            e(true);
        }
        return false;
    }

    public final void e(boolean z14) {
        if (!(d() && this.P) && p()) {
            androidx.media3.ui.c cVar = this.f9965l;
            boolean z15 = cVar.g() && cVar.getShowTimeoutMs() <= 0;
            boolean zG = g();
            if (z14 || z15 || zG) {
                h(zG);
            }
        }
    }

    public final boolean f(Drawable drawable) {
        ImageView imageView = this.f9960h;
        if (imageView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f9976y == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f9954b;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(width);
                }
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        z zVar = this.f9972t;
        if (zVar == null) {
            return true;
        }
        int playbackState = zVar.getPlaybackState();
        if (!this.I) {
            return false;
        }
        if (this.f9972t.isCommandAvailable(17) && this.f9972t.getCurrentTimeline().p()) {
            return false;
        }
        if (playbackState != 1 && playbackState != 4) {
            z zVar2 = this.f9972t;
            zVar2.getClass();
            if (zVar2.getPlayWhenReady()) {
                return false;
            }
        }
        return true;
    }

    public List<androidx.media3.common.a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f9967n;
        if (frameLayout != null) {
            androidx.media3.common.a.C0117a c0117a = new androidx.media3.common.a.C0117a(frameLayout, 4);
            c0117a.f8120c = "Transparent overlay does not impact viewability";
            arrayList.add(new androidx.media3.common.a(c0117a.f8118a, c0117a.f8119b, "Transparent overlay does not impact viewability"));
        }
        androidx.media3.ui.c cVar = this.f9965l;
        if (cVar != null) {
            androidx.media3.common.a.C0117a c0117a2 = new androidx.media3.common.a.C0117a(cVar, 1);
            arrayList.add(new androidx.media3.common.a(c0117a2.f8118a, c0117a2.f8119b, c0117a2.f8120c));
        }
        return ImmutableList.copyOf((Collection) arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.f9966m;
        fa.a.g(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public int getArtworkDisplayMode() {
        return this.f9976y;
    }

    public boolean getControllerAutoShow() {
        return this.I;
    }

    public boolean getControllerHideOnTouch() {
        return this.T;
    }

    public int getControllerShowTimeoutMs() {
        return this.F;
    }

    public Drawable getDefaultArtwork() {
        return this.A;
    }

    public int getImageDisplayMode() {
        return this.f9977z;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f9967n;
    }

    public z getPlayer() {
        return this.f9972t;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f9954b;
        fa.a.f(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f9961i;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.f9976y != 0;
    }

    public boolean getUseController() {
        return this.f9973v;
    }

    public View getVideoSurfaceView() {
        return this.f9956d;
    }

    public final void h(boolean z14) {
        if (p()) {
            int i14 = z14 ? 0 : this.F;
            androidx.media3.ui.c cVar = this.f9965l;
            cVar.setShowTimeoutMs(i14);
            kc.f fVar = cVar.f10037a;
            androidx.media3.ui.c cVar2 = fVar.f103853a;
            if (!cVar2.h()) {
                cVar2.setVisibility(0);
                cVar2.i();
                ImageView imageView = cVar2.f10066o;
                if (imageView != null) {
                    imageView.requestFocus();
                }
            }
            fVar.k();
        }
    }

    public final void i() {
        if (!p() || this.f9972t == null) {
            return;
        }
        androidx.media3.ui.c cVar = this.f9965l;
        if (!cVar.g()) {
            e(true);
        } else if (this.T) {
            cVar.f();
        }
    }

    public final void j() {
        z zVar = this.f9972t;
        k0 videoSize = zVar != null ? zVar.getVideoSize() : k0.f8334d;
        int i14 = videoSize.f8335a;
        int i15 = videoSize.f8336b;
        float f14 = this.f9957e ? 0.0f : (i15 == 0 || i14 == 0) ? 0.0f : (i14 * videoSize.f8337c) / i15;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f9954b;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    public final void k() {
        boolean z14;
        View view2 = this.f9962j;
        if (view2 != null) {
            z zVar = this.f9972t;
            if (zVar == null || zVar.getPlaybackState() != 2) {
                z14 = false;
            } else {
                int i14 = this.B;
                z14 = true;
                if (i14 != 2 && (i14 != 1 || !this.f9972t.getPlayWhenReady())) {
                    z14 = false;
                }
            }
            view2.setVisibility(z14 ? 0 : 8);
        }
    }

    public final void l() {
        androidx.media3.ui.c cVar = this.f9965l;
        if (cVar == null || !this.f9973v) {
            setContentDescription(null);
        } else if (cVar.g()) {
            setContentDescription(this.T ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    public final void m() {
        m<? super PlaybackException> mVar;
        TextView textView = this.f9963k;
        if (textView != null) {
            CharSequence charSequence = this.E;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                return;
            }
            z zVar = this.f9972t;
            ExoPlaybackException playerError = zVar != null ? zVar.getPlayerError() : null;
            if (playerError == null || (mVar = this.D) == null) {
                textView.setVisibility(8);
            } else {
                textView.setText((CharSequence) mVar.a(playerError).second);
                textView.setVisibility(0);
            }
        }
    }

    public final void n(boolean z14) {
        byte[] bArr;
        Drawable drawable;
        z zVar = this.f9972t;
        boolean zF = false;
        boolean z15 = (zVar == null || !zVar.isCommandAvailable(30) || zVar.g().f8302a.isEmpty()) ? false : true;
        boolean z16 = this.C;
        ImageView imageView = this.f9960h;
        View view2 = this.f9955c;
        if (!z16 && (!z15 || z14)) {
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view2 != null) {
                view2.setVisibility(0);
            }
            c();
        }
        if (z15) {
            z zVar2 = this.f9972t;
            boolean z17 = zVar2 != null && zVar2.isCommandAvailable(30) && zVar2.g().b(2);
            boolean zB = b();
            if (!z17 && !zB) {
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                c();
            }
            ImageView imageView2 = this.f9959g;
            boolean z18 = (view2 == null || view2.getVisibility() != 4 || imageView2 == null || (drawable = imageView2.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
            if (zB && !z17 && z18) {
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    o();
                }
            } else if (z17 && !zB && z18) {
                c();
            }
            if (!z17 && !zB && this.f9976y != 0) {
                fa.a.f(imageView);
                if (zVar != null && zVar.isCommandAvailable(18) && (bArr = zVar.getMediaMetadata().f8527f) != null) {
                    zF = f(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                }
                if (zF || f(this.A)) {
                    return;
                }
            }
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
        }
    }

    public final void o() {
        Drawable drawable;
        AspectRatioFrameLayout aspectRatioFrameLayout;
        ImageView imageView = this.f9959g;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float width = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.f9977z == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (imageView.getVisibility() == 0 && (aspectRatioFrameLayout = this.f9954b) != null) {
            aspectRatioFrameLayout.setAspectRatio(width);
        }
        imageView.setScaleType(scaleType);
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!p() || this.f9972t == null) {
            return false;
        }
        e(true);
        return true;
    }

    public final boolean p() {
        if (!this.f9973v) {
            return false;
        }
        fa.a.f(this.f9965l);
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        i();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i14) {
        fa.a.d(i14 == 0 || this.f9960h != null);
        if (this.f9976y != i14) {
            this.f9976y = i14;
            n(false);
        }
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.b bVar) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f9954b;
        fa.a.f(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(bVar);
    }

    public void setControllerAnimationEnabled(boolean z14) {
        androidx.media3.ui.c cVar = this.f9965l;
        fa.a.f(cVar);
        cVar.setAnimationEnabled(z14);
    }

    public void setControllerAutoShow(boolean z14) {
        this.I = z14;
    }

    public void setControllerHideDuringAds(boolean z14) {
        this.P = z14;
    }

    public void setControllerHideOnTouch(boolean z14) {
        fa.a.f(this.f9965l);
        this.T = z14;
        l();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(androidx.media3.ui.c.d dVar) {
        androidx.media3.ui.c cVar = this.f9965l;
        fa.a.f(cVar);
        cVar.setOnFullScreenModeChangedListener(dVar);
    }

    public void setControllerShowTimeoutMs(int i14) {
        androidx.media3.ui.c cVar = this.f9965l;
        fa.a.f(cVar);
        this.F = i14;
        if (cVar.g()) {
            h(g());
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(androidx.media3.ui.c.m mVar) {
        androidx.media3.ui.c cVar = this.f9965l;
        fa.a.f(cVar);
        CopyOnWriteArrayList<androidx.media3.ui.c.m> copyOnWriteArrayList = cVar.f10043d;
        androidx.media3.ui.c.m mVar2 = this.f9975x;
        if (mVar2 == mVar) {
            return;
        }
        if (mVar2 != null) {
            copyOnWriteArrayList.remove(mVar2);
        }
        this.f9975x = mVar;
        if (mVar != null) {
            copyOnWriteArrayList.add(mVar);
            setControllerVisibilityListener((c) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        fa.a.d(this.f9963k != null);
        this.E = charSequence;
        m();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.A != drawable) {
            this.A = drawable;
            n(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean z14) {
        this.f9964k0 = z14;
    }

    public void setErrorMessageProvider(m<? super PlaybackException> mVar) {
        if (this.D != mVar) {
            this.D = mVar;
            m();
        }
    }

    public void setFullscreenButtonClickListener(d dVar) {
        androidx.media3.ui.c cVar = this.f9965l;
        fa.a.f(cVar);
        cVar.setOnFullScreenModeChangedListener(this.f9953a);
    }

    public void setFullscreenButtonState(boolean z14) {
        androidx.media3.ui.c cVar = this.f9965l;
        fa.a.f(cVar);
        cVar.k(z14);
    }

    public void setImageDisplayMode(int i14) {
        fa.a.d(this.f9959g != null);
        if (this.f9977z != i14) {
            this.f9977z = i14;
            o();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z14) {
        if (this.C != z14) {
            this.C = z14;
            n(false);
        }
    }

    public void setPlayer(z zVar) {
        fa.a.d(Looper.myLooper() == Looper.getMainLooper());
        fa.a.a(zVar == null || zVar.getApplicationLooper() == Looper.getMainLooper());
        z zVar2 = this.f9972t;
        if (zVar2 == zVar) {
            return;
        }
        View view2 = this.f9956d;
        b bVar = this.f9953a;
        if (zVar2 != null) {
            zVar2.d(bVar);
            if (zVar2.isCommandAvailable(27)) {
                if (view2 instanceof TextureView) {
                    zVar2.clearVideoTextureView((TextureView) view2);
                } else if (view2 instanceof SurfaceView) {
                    zVar2.clearVideoSurfaceView((SurfaceView) view2);
                }
            }
            Class<?> cls = this.f9969p;
            if (cls != null && cls.isAssignableFrom(zVar2.getClass())) {
                try {
                    Method method = this.f9970q;
                    method.getClass();
                    method.invoke(zVar2, null);
                } catch (IllegalAccessException | InvocationTargetException e4) {
                    o2.c.p(e4);
                    return;
                }
            }
        }
        SubtitleView subtitleView = this.f9961i;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f9972t = zVar;
        boolean zP = p();
        androidx.media3.ui.c cVar = this.f9965l;
        if (zP) {
            cVar.setPlayer(zVar);
        }
        k();
        m();
        n(true);
        if (zVar == null) {
            if (cVar != null) {
                cVar.f();
                return;
            }
            return;
        }
        if (zVar.isCommandAvailable(27)) {
            if (view2 instanceof TextureView) {
                zVar.setVideoTextureView((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                zVar.setVideoSurfaceView((SurfaceView) view2);
            }
            if (!zVar.isCommandAvailable(30) || zVar.g().c(2)) {
                j();
            }
        }
        if (subtitleView != null && zVar.isCommandAvailable(28)) {
            subtitleView.setCues(zVar.getCurrentCues().f63586a);
        }
        zVar.e(bVar);
        setImageOutput(zVar);
        e(false);
    }

    public void setRepeatToggleModes(int i14) {
        androidx.media3.ui.c cVar = this.f9965l;
        fa.a.f(cVar);
        cVar.setRepeatToggleModes(i14);
    }

    public void setResizeMode(int i14) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f9954b;
        fa.a.f(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i14);
    }

    public void setShowBuffering(int i14) {
        if (this.B != i14) {
            this.B = i14;
            k();
        }
    }

    public void setShowFastForwardButton(boolean z14) {
        androidx.media3.ui.c cVar = this.f9965l;
        fa.a.f(cVar);
        cVar.setShowFastForwardButton(z14);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z14) {
        androidx.media3.ui.c cVar = this.f9965l;
        fa.a.f(cVar);
        cVar.setShowMultiWindowTimeBar(z14);
    }

    public void setShowNextButton(boolean z14) {
        androidx.media3.ui.c cVar = this.f9965l;
        fa.a.f(cVar);
        cVar.setShowNextButton(z14);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z14) {
        androidx.media3.ui.c cVar = this.f9965l;
        fa.a.f(cVar);
        cVar.setShowPlayButtonIfPlaybackIsSuppressed(z14);
    }

    public void setShowPreviousButton(boolean z14) {
        androidx.media3.ui.c cVar = this.f9965l;
        fa.a.f(cVar);
        cVar.setShowPreviousButton(z14);
    }

    public void setShowRewindButton(boolean z14) {
        androidx.media3.ui.c cVar = this.f9965l;
        fa.a.f(cVar);
        cVar.setShowRewindButton(z14);
    }

    public void setShowShuffleButton(boolean z14) {
        androidx.media3.ui.c cVar = this.f9965l;
        fa.a.f(cVar);
        cVar.setShowShuffleButton(z14);
    }

    public void setShowSubtitleButton(boolean z14) {
        androidx.media3.ui.c cVar = this.f9965l;
        fa.a.f(cVar);
        cVar.setShowSubtitleButton(z14);
    }

    public void setShowVrButton(boolean z14) {
        androidx.media3.ui.c cVar = this.f9965l;
        fa.a.f(cVar);
        cVar.setShowVrButton(z14);
    }

    public void setShutterBackgroundColor(int i14) {
        View view2 = this.f9955c;
        if (view2 != null) {
            view2.setBackgroundColor(i14);
        }
    }

    @Deprecated
    public void setUseArtwork(boolean z14) {
        setArtworkDisplayMode(!z14 ? 1 : 0);
    }

    public void setUseController(boolean z14) {
        boolean z15 = true;
        androidx.media3.ui.c cVar = this.f9965l;
        fa.a.d((z14 && cVar == null) ? false : true);
        if (!z14 && !hasOnClickListeners()) {
            z15 = false;
        }
        setClickable(z15);
        if (this.f9973v == z14) {
            return;
        }
        this.f9973v = z14;
        if (p()) {
            cVar.setPlayer(this.f9972t);
        } else if (cVar != null) {
            cVar.f();
            cVar.setPlayer(null);
        }
        l();
    }

    @Override // android.view.View
    public void setVisibility(int i14) {
        super.setVisibility(i14);
        View view2 = this.f9956d;
        if (view2 instanceof SurfaceView) {
            view2.setVisibility(i14);
        }
    }

    public void setControllerVisibilityListener(c cVar) {
        this.f9974w = cVar;
        if (cVar != null) {
            setControllerVisibilityListener((androidx.media3.ui.c.m) null);
        }
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerView(Context context) {
        this(context, null);
    }
}
