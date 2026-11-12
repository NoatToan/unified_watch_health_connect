package com.garmin.android.apps.connectmobile.social;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connectiq.x;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import do1.v;
import e23.p;
import hz0.i0;
import hz0.j0;
import java.util.Arrays;
import java.util.List;
import lc.u0;
import o13.r;
import o53.b0;
import o53.s0;
import o53.t1;
import oz0.h;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.h0;
import u53.o;
import v13.i;
import wg0.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/VideoPlayerActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VideoPlayerActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f44499a = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.social.VideoPlayerActivity$onCreate$1", f = "VideoPlayerActivity.kt", l = {53, 55, 64}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f44500a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f44502c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.social.VideoPlayerActivity$onCreate$1$1", f = "VideoPlayerActivity.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ v2<h> f44503a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VideoPlayerActivity f44504b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(v2<h> v2Var, VideoPlayerActivity videoPlayerActivity, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f44503a = v2Var;
                this.f44504b = videoPlayerActivity;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f44503a, this.f44504b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                oz0.i iVar;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                List<oz0.i> list = ((h) ((v2.b) this.f44503a).f47386a).f134482c;
                if (list != null && (iVar = (oz0.i) h0.d0(list)) != null) {
                    oz0.d dVar = iVar.f134488d;
                    VideoPlayerActivity videoPlayerActivity = this.f44504b;
                    ((TextView) videoPlayerActivity.findViewById(R.id.video_title)).setText(dVar != null ? dVar.f134457c : null);
                    ((TextView) videoPlayerActivity.findViewById(R.id.video_description)).setText(dVar != null ? dVar.f134458d : null);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.social.VideoPlayerActivity$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.social.VideoPlayerActivity$onCreate$1$2", f = "VideoPlayerActivity.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C0840b extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f44505a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v2<h> f44506b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VideoPlayerActivity f44507c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0840b(v2<h> v2Var, VideoPlayerActivity videoPlayerActivity, t13.d<? super C0840b> dVar) {
                super(2, dVar);
                this.f44506b = v2Var;
                this.f44507c = videoPlayerActivity;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C0840b c0840b = new C0840b(this.f44506b, this.f44507c, dVar);
                c0840b.f44505a = obj;
                return c0840b;
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C0840b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                Exception exc = ((v2.a) this.f44506b).f47383a;
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.g(a2Var, "VideoPlayerActivity", exc);
                a aVar3 = VideoPlayerActivity.f44499a;
                this.f44507c.displayFailedMessage();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k kVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f44502c = kVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return VideoPlayerActivity.this.new b(this.f44502c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
        
            if (ge1.b.e0(r1, r2, r8) == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
        
            if (ge1.b.e0(r1, r3, r8) == r0) goto L24;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f44500a;
            VideoPlayerActivity videoPlayerActivity = VideoPlayerActivity.this;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                } else {
                    if (i14 != 2 && i14 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
            r.b(obj);
            Context applicationContext = videoPlayerActivity.getApplicationContext();
            applicationContext.getClass();
            j0 j0Var = new j0(applicationContext);
            String str = this.f44502c.f185099b;
            String string = videoPlayerActivity.getString(R.string.api_key);
            string.getClass();
            this.f44500a = 1;
            obj = f0.J(j0Var, new i0(j0Var, str, string, null), this);
            if (obj != aVar) {
            }
            return aVar;
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                x53.c cVar = s0.f129406a;
                t1 t1Var = o.f168762a;
                a aVar2 = new a(v2Var, videoPlayerActivity, null);
                this.f44500a = 2;
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                x53.c cVar2 = s0.f129406a;
                t1 t1Var2 = o.f168762a;
                C0840b c0840b = new C0840b(v2Var, videoPlayerActivity, null);
                this.f44500a = 3;
            }
        }
    }

    public final long ca() {
        Intent intent = getIntent();
        Parcelable parcelable = null;
        if (Build.VERSION.SDK_INT < 33) {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("extra_news_feed_video") : null;
            parcelable = (k) (parcelableExtra instanceof k ? parcelableExtra : null);
        } else if (intent != null) {
            parcelable = (Parcelable) intent.getParcelableExtra("extra_news_feed_video", k.class);
        }
        k kVar = (k) parcelable;
        if (kVar != null) {
            return kVar.f185098a;
        }
        return -1L;
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = intent != null ? (Parcelable) intent.getParcelableExtra("extra_news_feed_video", k.class) : null;
        } else {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("extra_news_feed_video") : null;
            if (!(parcelableExtra instanceof k)) {
                parcelableExtra = null;
            }
            parcelable = (k) parcelableExtra;
        }
        k kVar = (k) parcelable;
        if (kVar == null) {
            finish();
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "VideoPlayerActivity", "No video data provided in intent extras");
            return;
        }
        setContentView(R.layout.activity_video_player);
        initActionBar(true, R.string.devices_video);
        androidx.lifecycle.i0 i0VarW = o53.f0.w(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(i0VarW, x53.b.f189152a, null, new b(kVar, null), 2);
        findViewById(R.id.video_link_layout).setOnClickListener(new cw2.b(4, this, kVar));
        findViewById(R.id.term_link_layout).setOnClickListener(new x(this, 19));
        View viewFindViewById = findViewById(R.id.web_view);
        WebView webView = (WebView) viewFindViewById;
        webView.setBackgroundColor(a7.b.getColor(webView.getContext(), android.R.color.white));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setCacheMode(-1);
        webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setScrollContainer(false);
        webView.setWebChromeClient(new WebChromeClient());
        webView.loadDataWithBaseURL("https://www.youtube-nocookie.com", String.format("<!DOCTYPE html>\n            <html>\n                <head>\n                    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n                    <style>\n                            body,\n                            html {\n                                margin: 0;\n                                height: 100%%;\n                                width: 100%%;\n                            }\n                    </style>\n                </head>\n                <body>\n                    <div id=\"player\"></div>\n                    <script>\n                        var tag = document.createElement('script');\n                        tag.src = \"https://www.youtube.com/iframe_api\";\n                        var firstScriptTag = document.getElementsByTagName('script')[0];\n                        firstScriptTag.parentNode.insertBefore(tag, firstScriptTag);\n                \n                        var player;\n                        function onYouTubeIframeAPIReady() {\n                            player = new YT.Player('player', {\n                                margin: '0',\n                                height: '100%%',\n                                width: '100%%',\n                                videoId: '%s',\n                                playerVars: { 'autoplay': 1 }\n                            });\n                        }\n                    </script>\n                </body>\n            </html>", Arrays.copyOf(new Object[]{kVar.f185099b}, 1)), "text/html", "utf-8", "");
        viewFindViewById.getClass();
        if (ca() > 0) {
            addMenuProvider(new v(this), this, androidx.lifecycle.b0.b.RESUMED);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/VideoPlayerActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_NEWS_FEED_VIDEO", "YOUTUBE_TERM_OF_SERVICE_LINK", "YOUTUBE_BASE_URL", "HTML", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, k kVar) {
            kVar.getClass();
            Intent intent = new Intent(context, (Class<?>) VideoPlayerActivity.class);
            intent.putExtra("extra_news_feed_video", kVar);
            return intent;
        }

        private a() {
        }
    }
}
