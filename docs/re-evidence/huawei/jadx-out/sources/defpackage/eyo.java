package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaMetadata;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.playercontroller.api.PlayerEventApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class eyo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private gog f33693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f33694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f33695c;
    private gdy d;
    private String e;
    private get f;
    private a g;
    private boolean h;
    private long i;
    private PlaybackState j;
    private long k;
    private String l;
    private PlayerEventApi m;
    private BroadcastReceiver n;
    private CopyOnWriteArrayList<gog> o;

    static class a extends get.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<eyo> f33696a;

        @Override // get.a
        public void onMetadataChanged(MediaMetadata mediaMetadata) {
        }

        a(eyo eyoVar) {
            this.f33696a = new WeakReference<>(eyoVar);
        }

        @Override // get.a
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            if (playbackState == null) {
                LogUtil.j("PlayerEventManager", "onPlaybackStateChanged, state is null ,this should NOT happen...");
                return;
            }
            eyo eyoVar = this.f33696a.get();
            if (eyoVar == null || TextUtils.isEmpty(eyoVar.e)) {
                LogUtil.j("PlayerEventManager", "onPlaybackStateChanged manager is null");
                return;
            }
            Bundle extras = playbackState.getExtras();
            if (extras == null || (!"sleepMusic".equals(extras.getString("category")) && !TextUtils.equals("generativeSleepMusic", extras.getString("category")))) {
                eyoVar.e();
            } else {
                LogUtil.d("PlayerEventManager", "onPlaybackStateChanged state:", playbackState.toString());
                eyoVar.c(playbackState);
            }
        }
    }

    /* JADX INFO: loaded from: classes28.dex */
    static class d extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<eyo> f33697a;

        public d(eyo eyoVar) {
            this.f33697a = new WeakReference<>(eyoVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.a("PlayerEventManager", "notification event action:", intent.getAction());
            eyo eyoVar = this.f33697a.get();
            if (eyoVar != null) {
                if (!TextUtils.equals(eyoVar.e, "sleepMusic")) {
                    LogUtil.j("PlayerEventManager", "mNotificationReceiver, is not sleep media");
                    return;
                }
                if (intent.getAction().equals("notification_play_or_pause_btn_clicked") || intent.getAction().equals("com.huawei.mediacontroller.intent.action.ButtonClick")) {
                    LogUtil.a("PlayerEventManager", "notification button clicked...  ", eyoVar.j);
                    if (eyoVar.j != null && eyoVar.f33693a != null) {
                        if (eyoVar.m == null) {
                            LogUtil.j("PlayerEventManager", "notification mPlayerEventApi is null");
                            return;
                        } else {
                            eyoVar.m.onPlayStatusChangeFromNotification(eyoVar.f33693a, eyoVar.j.getState());
                            return;
                        }
                    }
                    LogUtil.j("PlayerEventManager", "current status invalid, return");
                    return;
                }
                return;
            }
            LogUtil.j("PlayerEventManager", "onPlaybackStateChanged manager is null");
        }
    }

    private void a() {
        if (this.n == null) {
            this.n = new d(this);
            IntentFilter intentFilter = new IntentFilter();
            if (gfj.e()) {
                intentFilter.addAction("com.huawei.mediacontroller.intent.action.ButtonClick");
                BroadcastManagerUtil.c(BaseApplication.getContext(), this.n, intentFilter, "android.permission.MEDIA_CONTENT_CONTROL", null);
            } else {
                intentFilter.addAction("notification_removed");
                intentFilter.addAction("notification_play_or_pause_btn_clicked");
                BroadcastManagerUtil.d(BaseApplication.getContext(), this.n, intentFilter, LocalBroadcast.f36595c, null);
            }
        }
    }

    private void h() {
        try {
            if (this.n != null) {
                BaseApplication.getContext().unregisterReceiver(this.n);
                this.n = null;
            }
        } catch (IllegalArgumentException e2) {
            LogUtil.e("PlayerEventManager", e2.getMessage());
        }
    }

    static class e {
        private static final eyo e = new eyo();
    }

    private eyo() {
        this.f = get.c();
    }

    public static eyo d() {
        return e.e;
    }

    public void d(String str) {
        if (e(str)) {
            return;
        }
        if (TextUtils.equals(str, this.l)) {
            LogUtil.j("PlayerEventManager", "initPlayerEventApi params is same");
            return;
        }
        this.l = str;
        j();
        a();
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.e = jSONObject.getString("category");
            if (jSONObject.has("aiMusicResourceType")) {
                this.f33694b = jSONObject.getString("aiMusicResourceType");
            } else {
                if (!TextUtils.isEmpty(this.f33694b)) {
                    b(-1);
                }
                this.f33694b = "";
            }
            String string = jSONObject.getString("eventParamList");
            LogUtil.a("PlayerEventManager", "initPlayerEventApi businessTag:", this.e, "  paramListStr:", string);
            if (TextUtils.isEmpty(this.e)) {
                g();
                h();
            } else {
                this.m = eyv.c(this.e);
                CopyOnWriteArrayList<gog> copyOnWriteArrayListB = b(string);
                this.o = copyOnWriteArrayListB;
                LogUtil.a("PlayerEventManager", "initPlayerEventApi mPlayEventParamInfoList size:", Integer.valueOf(copyOnWriteArrayListB.size()));
            }
        } catch (JsonSyntaxException | JSONException unused) {
            LogUtil.e("PlayerEventManager", "parseParams fail:parameter invalid");
        }
    }

    private CopyOnWriteArrayList<gog> b(String str) {
        JsonArray asJsonArray = JsonParser.parseString(str).getAsJsonArray();
        Gson gson = new Gson();
        CopyOnWriteArrayList<gog> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        Iterator<JsonElement> it = asJsonArray.iterator();
        while (it.hasNext()) {
            copyOnWriteArrayList.add((gog) gson.fromJson(it.next(), gog.class));
        }
        return copyOnWriteArrayList;
    }

    private boolean e(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("businessType") && jSONObject.getInt("businessType") == 2) {
                b(-1);
                LogUtil.a("PlayerEventManager", "initPlayerEventApi businessType is 2 ");
                return true;
            }
        } catch (JsonSyntaxException | JSONException unused) {
            LogUtil.e("PlayerEventManager", "parseStopBusiness fail:parameter invalid");
        }
        return false;
    }

    public gog d(int i) {
        if (njy.e(this.o, i)) {
            return null;
        }
        return this.o.get(i);
    }

    private void j() {
        if (this.g == null) {
            a aVar = new a(this);
            this.g = aVar;
            this.f.e(aVar);
        }
    }

    private void g() {
        a aVar = this.g;
        if (aVar != null) {
            this.f.a(aVar);
            this.g = null;
        }
    }

    public void c() {
        g();
        h();
        CopyOnWriteArrayList<gog> copyOnWriteArrayList = this.o;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
        }
        this.e = "";
        this.l = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(PlaybackState playbackState) {
        gog gogVar;
        if (this.m == null) {
            LogUtil.j("PlayerEventManager", "onPlaybackStateChanged mPlayerEventApi is null");
            return;
        }
        int state = playbackState.getState();
        a(playbackState);
        if (state == 1) {
            ReleaseLogUtil.d("R_PlayerEventManager", "onPlaybackStateChanged PlaybackState.STATE_STOPPED");
            if (this.j == null) {
                ReleaseLogUtil.e("R_PlayerEventManager", "onPlaybackStateChanged mLastState is null");
                return;
            }
            gdy gdyVar = this.d;
            if (gdyVar != null && Math.abs(gdyVar.a() - (this.j.getPosition() / 1000)) < 3) {
                this.m.onPlayerFinishedMediaEvent(this.f33693a, this.d.a(), ((int) this.f33695c) / 1000, this.k);
            } else {
                this.m.onPlayerStopEvent(this.f33693a, this.j.getPosition() / 1000, ((int) this.f33695c) / 1000, this.k, this.h);
            }
            b(-1);
            this.f33695c = 0L;
            this.f33693a = null;
            this.d = null;
        } else if (state == 2) {
            ReleaseLogUtil.d("R_PlayerEventManager", "onPlaybackStateChanged PlaybackState.STATE_PAUSED");
            this.m.onPlayerPauseEvent(this.f33693a, playbackState.getPosition() / 1000, ((int) this.f33695c) / 1000, this.k);
            this.h = true;
        } else if (state == 3) {
            this.h = false;
            PlaybackState playbackState2 = this.j;
            if (playbackState2 == null || (playbackState2.getState() == 3 && this.j.getPosition() == 0)) {
                ReleaseLogUtil.d("R_PlayerEventManager", "onPlaybackStateChanged start playing");
                this.d = b();
                gog gogVarD = d(this.f.j());
                this.f33693a = gogVarD;
                gdy gdyVar2 = this.d;
                if (gdyVar2 != null) {
                    this.m.onPlayerStartPlayEvent(gogVarD, gdyVar2.a(), ((int) this.f33695c) / 1000, this.k);
                }
                this.f33695c = 0L;
                this.k = System.currentTimeMillis();
            } else {
                this.m.onPlayerProgressChange(this.f33693a, playbackState.getPosition() / 1000, ((int) this.f33695c) / 1000);
            }
        } else if (state == 10) {
            LogUtil.a("PlayerEventManager", "onPlaybackStateChanged PlaybackState.STATE_SKIPPING_TO_NEXT");
            gdy gdyVar3 = this.d;
            if (gdyVar3 != null && (gogVar = this.f33693a) != null) {
                this.m.onPlayerFinishedMediaEvent(gogVar, gdyVar3.a(), ((int) this.f33695c) / 1000, this.k);
            }
        }
        this.j = playbackState;
    }

    private void a(PlaybackState playbackState) {
        if (playbackState.getState() != 3) {
            return;
        }
        gog gogVar = this.f33693a;
        if (gogVar != null && !TextUtils.isEmpty(gogVar.a())) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jAbs = Math.abs(jCurrentTimeMillis - this.i);
            if (jAbs >= 2000) {
                this.f33695c += 1000;
            } else {
                this.f33695c += jAbs;
            }
            this.i = jCurrentTimeMillis;
            LogUtil.d("PlayerEventManager", "updateEffectiveDuration AI mEffectiveDuration=", Long.valueOf(this.f33695c));
            return;
        }
        PlaybackState playbackState2 = this.j;
        int iAbs = (int) Math.abs(playbackState.getPosition() - (playbackState2 == null ? 0L : playbackState2.getPosition()));
        LogUtil.d("PlayerEventManager", "updateEffectiveDuration mEffectiveDuration=", Long.valueOf(this.f33695c));
        if (iAbs < 2000) {
            this.f33695c += (long) iAbs;
        } else {
            LogUtil.a("PlayerEventManager", "updateEffectiveDuration playedTime=", Integer.valueOf(iAbs));
        }
    }

    private gdy b() {
        if (njy.e(this.f.g(), this.f.j())) {
            LogUtil.j("PlayerEventManager", "getCurrentAudioItem getPlayList error, index:", Integer.valueOf(this.f.j()));
            return null;
        }
        return this.f.g().get(this.f.j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.j == null) {
            LogUtil.a("PlayerEventManager", "mLastState is null");
            return;
        }
        b(-1);
        this.m.onPlayerStopEvent(this.f33693a, this.j.getPosition() / 1000, ((int) this.f33695c) / 1000, this.k, this.h);
        LogUtil.j("PlayerEventManager", "onPlaybackStateChanged not sleep music media");
        this.f33695c = 0L;
        this.f33693a = null;
        this.d = null;
        this.j = null;
    }

    private void b(int i) {
        gog gogVar = this.f33693a;
        if (gogVar == null || TextUtils.isEmpty(gogVar.a())) {
            return;
        }
        HashMap map = new HashMap();
        map.put("sessionId", Long.valueOf(System.currentTimeMillis()));
        map.put("pageId", "basic_framework_0001");
        HashMap map2 = new HashMap();
        map2.put("event", Integer.valueOf(i));
        map2.put("duration", Integer.valueOf(((int) this.f33695c) / 1000));
        map2.put(FunctionSetBeanReader.BI_ELEMENT, "m0");
        map2.put("resourceName", this.f33693a.e());
        map2.put("resourceType", this.f33694b);
        map2.put("moduleName", "music_playing");
        LogUtil.a("PlayerEventManager", "aiSleepMusicBiEvent contentMap is:", map2);
        lmn lmnVar = new lmn();
        lmnVar.e(map2);
        lmnVar.d(map);
        lmf.d().a(BaseApplication.getContext(), AnalyticsValue.AI_SLEEP_MUSIC_PLAY_H10900950001.value(), lmnVar, 0);
    }
}
