package com.garmin.android.apps.connectmobile.training.atp.create.video;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.h0;
import androidx.media3.common.q;
import androidx.media3.common.t;
import androidx.media3.common.x;
import androidx.media3.common.z;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.m;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.d;
import androidx.media3.exoplayer.v;
import androidx.media3.ui.PlayerView;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.collect.ImmutableList;
import g22.n;
import i.c;
import java.util.Collection;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import sa.r;
import wa.e;
import wa.i;
import xa.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/create/video/PlayerActivity;", "Li/c;", "Landroidx/media3/common/z$d;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PlayerActivity extends c implements z.d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f45317p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public bu1.b f45318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v f45319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f45320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public bu1.a f45321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h0 f45323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f45324g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f45325h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f45326i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f45327j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f45328k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f45329l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f45330m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f45331n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PlayerView f45332o;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/training/atp/create/video/PlayerActivity$b", "Landroidx/media3/ui/PlayerView$c;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements PlayerView.c {
        public b() {
        }

        @Override // androidx.media3.ui.PlayerView.c
        public final void a(int i14) {
            View view2 = PlayerActivity.this.f45329l;
            if (view2 != null) {
                view2.setVisibility(i14);
            } else {
                s.m("debugRootView");
                throw null;
            }
        }
    }

    static {
        new a(null);
    }

    public final int O9() {
        e eVar;
        i.a aVar;
        v vVar;
        if (this.f45319b == null || (eVar = this.f45320c) == null || (aVar = eVar.f183746c) == null) {
            return -1;
        }
        int i14 = aVar.f183747a;
        for (int i15 = 0; i15 < i14; i15++) {
            r rVar = aVar.f183749c[i15];
            rVar.getClass();
            if (rVar.f158153a != 0 && (vVar = this.f45319b) != null) {
                vVar.E();
                if (vVar.f9743g[i15].getTrackType() == 3) {
                    return i15;
                }
            }
        }
        return -1;
    }

    public final void P9() {
        q qVarA;
        v vVar;
        t tVar;
        t.h hVar;
        Intent intent = getIntent();
        if (this.f45319b == null) {
            wa.a.b bVar = new wa.a.b();
            e eVar = new e(this, bVar);
            this.f45320c = eVar;
            this.f45321d = new bu1.a(eVar, bVar);
            this.f45323f = null;
            this.f45318a = new bu1.b();
            ExoPlayer.b bVar2 = new ExoPlayer.b(this);
            bVar2.b(eVar);
            androidx.media3.exoplayer.source.e eVar2 = new androidx.media3.exoplayer.source.e(this);
            ha.i.b bVar3 = new ha.i.b();
            bVar3.f82606c = fa.z.D(this, getString(R.string.launcher_name_garmin_connect));
            bVar3.f82607d = 8000;
            bVar3.f82608e = 8000;
            bVar3.f82609f = true;
            bVar3.f82605b = h.g(this);
            eVar2.f9478c = bVar3;
            androidx.media3.exoplayer.source.e.a aVar = eVar2.f9477b;
            if (bVar3 != aVar.f9489d) {
                aVar.f9489d = bVar3;
                aVar.f9487b.clear();
                aVar.f9488c.clear();
            }
            fa.a.d(!bVar2.f8658v);
            bVar2.f8640d = new m(eVar2, 5);
            v vVarA = bVar2.a();
            this.f45319b = vVarA;
            vVarA.f9751l.a(this);
            bu1.b bVar4 = this.f45318a;
            if (bVar4 != null) {
                v vVar2 = this.f45319b;
                if (vVar2 != null) {
                    vVar2.f9751l.a(bVar4);
                }
                v vVar3 = this.f45319b;
                if (vVar3 != null) {
                    vVar3.f9757r.V4(bVar4);
                }
            }
            PlayerView playerView = this.f45332o;
            if (playerView == null) {
                s.m("playerView");
                throw null;
            }
            playerView.setPlayer(this.f45319b);
            v vVar4 = this.f45319b;
            if (vVar4 != null) {
                vVar4.setPlayWhenReady(this.f45324g);
            }
        }
        String action = intent.getAction();
        if (!"com.google.android.exoplayer.demo.action.VIEW".equals(action)) {
            String string = getString(R.string.unexpected_intent_action, action);
            string.getClass();
            Toast.makeText(getApplicationContext(), string, 1).show();
            return;
        }
        Uri data = intent.getData();
        this.f45328k = intent.getStringExtra("caption_uri");
        String stringExtra = intent.getStringExtra("name");
        this.f45327j = stringExtra;
        TextView textView = this.f45331n;
        if (textView == null) {
            s.m("videoNameView");
            throw null;
        }
        textView.setText(stringExtra);
        ImageView imageView = this.f45330m;
        if (imageView == null) {
            s.m("closeCaptionButton");
            throw null;
        }
        imageView.setOnClickListener(new bu1.c(this, 1));
        Uri uri = n.d(this.f45328k) ? Uri.parse(this.f45328k) : null;
        if (uri != null) {
            q.b bVar5 = new q.b();
            bVar5.f8403e = 1;
            bVar5.f8411m = x.n(MimeTypes.TEXT_VTT);
            qVarA = bVar5.a();
        } else {
            qVarA = null;
        }
        t.c cVar = new t.c();
        cVar.f8447b = data;
        if (uri != null && qVarA != null) {
            t.k.a aVar2 = new t.k.a(uri);
            aVar2.f8500b = x.n(qVarA.f8386n);
            aVar2.f8501c = qVarA.f8376d;
            aVar2.f8502d = qVarA.f8377e;
            cVar.f8453h = ImmutableList.copyOf((Collection) ImmutableList.of(new t.k(aVar2)));
        }
        t tVarA = cVar.a();
        t[] tVarArr = {tVarA};
        if (fa.z.f70071a >= 23 && (hVar = (tVar = tVarArr[0]).f8439b) != null) {
            if (fa.z.N(this, hVar.f8482a)) {
                return;
            }
            ImmutableList<t.k> immutableList = tVar.f8439b.f8488g;
            for (int i14 = 0; i14 < immutableList.size(); i14++) {
                if (fa.z.N(this, immutableList.get(i14).f8492a)) {
                    return;
                }
            }
        }
        int i15 = this.f45325h;
        if (i15 != -1 && (vVar = this.f45319b) != null) {
            vVar.i(this.f45326i, i15, false);
        }
        v vVar5 = this.f45319b;
        if (vVar5 != null) {
            vVar5.k(tVarA);
        }
        v vVar6 = this.f45319b;
        if (vVar6 != null) {
            vVar6.prepare();
        }
        this.f45322e = false;
        R9();
    }

    public final void Q9() {
        v vVar = this.f45319b;
        if (vVar != null) {
            this.f45324g = vVar.getPlayWhenReady();
            S9();
            vVar.release();
            this.f45319b = null;
            this.f45320c = null;
            this.f45321d = null;
            this.f45318a = null;
        }
    }

    public final void R9() {
        TextView textView = this.f45331n;
        if (textView == null) {
            s.m("videoNameView");
            throw null;
        }
        textView.setVisibility(!TextUtils.isEmpty(this.f45327j) ? 0 : 8);
        ImageView imageView = this.f45330m;
        if (imageView != null) {
            imageView.setVisibility(TextUtils.isEmpty(this.f45328k) ? 8 : 0);
        } else {
            s.m("closeCaptionButton");
            throw null;
        }
    }

    public final void S9() {
        v vVar = this.f45319b;
        this.f45325h = vVar != null ? vVar.getCurrentMediaItemIndex() : 0;
        v vVar2 = this.f45319b;
        this.f45326i = Math.max(0L, vVar2 != null ? vVar2.getContentPosition() : 0L);
    }

    @Override // androidx.media3.common.z.d
    public final void a6(int i14, z.e eVar, z.e eVar2) {
        if (this.f45322e) {
            S9();
        }
    }

    @Override // i.c, z6.e, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        PlayerView playerView = this.f45332o;
        if (playerView != null) {
            return playerView.dispatchKeyEvent(keyEvent);
        }
        s.m("playerView");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    @Override // androidx.media3.common.z.d
    public final void g1(PlaybackException playbackException) {
        String string;
        playbackException.getClass();
        Throwable cause = playbackException.getCause();
        int i14 = playbackException.errorCode;
        if (i14 == 4001) {
            if (cause instanceof MediaCodecRenderer.DecoderInitializationException) {
                MediaCodecRenderer.DecoderInitializationException decoderInitializationException = (MediaCodecRenderer.DecoderInitializationException) cause;
                d dVar = decoderInitializationException.codecInfo;
                if (dVar == null) {
                    boolean z14 = decoderInitializationException.secureDecoderRequired;
                    String str = decoderInitializationException.mimeType;
                    string = z14 ? getString(R.string.error_no_secure_decoder, str) : getString(R.string.error_no_decoder, str);
                } else {
                    string = getString(R.string.error_instantiating_decoder, dVar.f9270a);
                }
            } else {
                string = null;
            }
        } else if (i14 == 4002) {
            string = getString(R.string.error_querying_decoders);
        } else {
            string = null;
        }
        if (string != null) {
            Toast.makeText(getApplicationContext(), string, 1).show();
        }
        this.f45322e = true;
        if (playbackException.errorCode == 1002) {
            this.f45325h = -1;
            this.f45326i = C.TIME_UNSET;
            P9();
            return;
        }
        S9();
        R9();
        View view2 = this.f45329l;
        if (view2 != null) {
            view2.setVisibility(0);
        } else {
            s.m("debugRootView");
            throw null;
        }
    }

    @Override // androidx.media3.common.z.d
    public final void g2(h0 h0Var) {
        h0Var.getClass();
        R9();
        if (h0Var != this.f45323f) {
            if (h0Var.a(2) && !h0Var.c(2)) {
                String string = getString(R.string.error_unsupported_video);
                string.getClass();
                Toast.makeText(getApplicationContext(), string, 1).show();
            }
            if (h0Var.a(1) && !h0Var.c(1)) {
                String string2 = getString(R.string.error_unsupported_audio);
                string2.getClass();
                Toast.makeText(getApplicationContext(), string2, 1).show();
            }
            this.f45323f = h0Var;
        }
    }

    @Override // androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f45324g = true;
        this.f45325h = -1;
        this.f45326i = C.TIME_UNSET;
        new Handler(Looper.getMainLooper());
        setContentView(R.layout.gcm4_video_player_activity);
        View viewFindViewById = findViewById(R.id.controls_root);
        viewFindViewById.getClass();
        this.f45329l = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.retry_button);
        viewFindViewById2.getClass();
        ((Button) viewFindViewById2).setOnClickListener(new bu1.c(this, 0));
        View viewFindViewById3 = findViewById(R.id.video_name);
        viewFindViewById3.getClass();
        this.f45331n = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.close_caption);
        viewFindViewById4.getClass();
        this.f45330m = (ImageView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.player_view);
        viewFindViewById5.getClass();
        PlayerView playerView = (PlayerView) viewFindViewById5;
        this.f45332o = playerView;
        playerView.setControllerVisibilityListener(new b());
        PlayerView playerView2 = this.f45332o;
        if (playerView2 != null) {
            playerView2.requestFocus();
        } else {
            s.m("playerView");
            throw null;
        }
    }

    @Override // b.g, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Q9();
        this.f45324g = true;
        this.f45325h = -1;
        this.f45326i = C.TIME_UNSET;
        setIntent(intent);
    }

    @Override // androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (fa.z.f70071a <= 23) {
            Q9();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.common.z.d
    public final void onPlaybackStateChanged(int i14) {
        e eVar;
        e.C3405e.a aVar = null;
        Object[] objArr = 0;
        if (i14 == 4) {
            View view2 = this.f45329l;
            if (view2 == null) {
                s.m("debugRootView");
                throw null;
            }
            view2.setVisibility(0);
        }
        if (i14 == 3) {
            boolean zH = ((rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null)).H();
            e eVar2 = this.f45320c;
            if (eVar2 != null) {
                e.C3405e c3405eA = eVar2.a();
                c3405eA.getClass();
                aVar = new e.C3405e.a();
            }
            if (aVar != null) {
                aVar.n(O9(), !zH);
            }
            if (aVar != null) {
                aVar.A.clear();
            }
            if (aVar != null && (eVar = this.f45320c) != null) {
                eVar.g(aVar.a());
            }
        }
        R9();
    }

    @Override // androidx.media3.common.z.d
    public final void onRepeatModeChanged(int i14) {
    }

    @Override // androidx.fragment.app.m, b.g, android.app.Activity
    public final void onRequestPermissionsResult(int i14, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        super.onRequestPermissionsResult(i14, strArr, iArr);
        j22.b.f96736a.getClass();
        if (j22.b.E(iArr)) {
            P9();
            return;
        }
        String string = getString(R.string.storage_permission_denied);
        string.getClass();
        Toast.makeText(getApplicationContext(), string, 1).show();
        finish();
    }

    @Override // androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (fa.z.f70071a <= 23 || this.f45319b == null) {
            P9();
        }
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        super.onStart();
        if (fa.z.f70071a > 23) {
            P9();
        }
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (fa.z.f70071a > 23) {
            Q9();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/create/video/PlayerActivity$a;", "", "<init>", "()V", "", "ACTION_VIEW", "Ljava/lang/String;", "EXTRAS_NAME", "CAPTION_URI", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
