package com.huawei.healthcloud.plugintrack.manager.voice;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Message;
import com.huawei.healthcloud.plugintrack.manager.voice.constructor.ChineseVoiceConstructor;
import com.huawei.healthcloud.plugintrack.manager.voice.constructor.EnglishVoiceConstructor;
import com.huawei.healthcloud.plugintrack.manager.voice.constructor.ISoundResourceConstructor;
import com.huawei.healthcloud.plugintrack.manager.voice.constructor.IVoiceContentConstructor;
import com.huawei.healthcloud.plugintrack.manager.voice.constructor.IVoiceEngine;
import com.huawei.healthcloud.plugintrack.manager.voice.constructor.VoicePlayInterface;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.jaa;
import defpackage.jas;
import defpackage.jaw;
import defpackage.jaz;
import defpackage.jbc;
import defpackage.pqj;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class VoicePlayer implements VoicePlayInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f10486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IVoiceContentConstructor f10487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10488c;
    private volatile boolean d = true;
    private MediaPlayer.OnCompletionListener e = new MediaPlayer.OnCompletionListener() { // from class: com.huawei.healthcloud.plugintrack.manager.voice.VoicePlayer.5
        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            if (mediaPlayer == null) {
                LogUtil.a("Track_VoicePlayer", "The voice was phoning!");
                VoicePlayer.this.d = true;
                VoicePlayer.this.g.a();
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            VoicePlayer.this.d = true;
            VoicePlayer.this.i.sendMessage(messageObtain);
            if (VoicePlayer.this.g.b()) {
                VoicePlayer.this.j.setVoiceIntentBufferState(true);
            }
        }
    };
    private jaw g;
    private Handler i;
    private IVoiceEngine j;

    @Override // com.huawei.healthcloud.plugintrack.manager.voice.constructor.VoicePlayInterface
    public void continuePlay() {
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.voice.constructor.VoicePlayInterface
    public int getType() {
        return 0;
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.voice.constructor.VoicePlayInterface
    public void muteVolume() {
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.voice.constructor.VoicePlayInterface
    public void pausePlay() {
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.voice.constructor.VoicePlayInterface
    public void resumeVolume() {
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.voice.constructor.VoicePlayInterface
    public void startPlay(String str) {
    }

    public VoicePlayer(Context context) {
        if (context == null) {
            throw new RuntimeException("VoicePlayer invalid params in constructor");
        }
        this.f10486a = context;
        this.g = new jaw(3);
        this.i = new b();
        e(this.f10486a);
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.voice.constructor.VoicePlayInterface
    public void insertVoice(Intent intent) {
        if (intent == null) {
            LogUtil.e("Track_VoicePlayer", "intent null");
            return;
        }
        if ("immediately_play".equals(intent.getStringExtra("SPEAK_EXTRA_MESSAGE"))) {
            this.g.d(intent);
        } else {
            this.g.a(intent);
        }
        Message messageObtain = Message.obtain();
        if (intent.getIntExtra("SPEAK_TYPE", -1) == 4) {
            this.d = true;
        }
        messageObtain.what = 1;
        this.i.sendMessage(messageObtain);
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.voice.constructor.VoicePlayInterface
    public void resetPlayer() {
        this.d = true;
        this.g.a();
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.voice.constructor.VoicePlayInterface
    public void stopPlay() {
        LogUtil.a("Track_VoicePlayer", "stop() enter");
        this.j.stopVoice();
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.voice.constructor.VoicePlayInterface
    public void destroy() {
        LogUtil.a("Track_VoicePlayer", "destroy() enter");
        this.f10487b.release();
        this.j.unregisterVoicePlayCompletionListener();
        this.j.destroy();
    }

    private void c(boolean z, int i, Object obj) {
        LogUtil.a("Track_VoicePlayer", "play() enter");
        if (UnitUtil.f()) {
            LogUtil.a("Track_VoicePlayer", "unexpected imperial unit status");
            return;
        }
        if (this.f10488c) {
            if (!LanguageUtil.o(this.f10486a)) {
                destroy();
                e(this.f10486a);
            }
        } else if (LanguageUtil.o(this.f10486a)) {
            destroy();
            e(this.f10486a);
        }
        if (i == 10) {
            this.j.playVoice(obj, z);
        } else {
            this.j.playVoice(this.f10487b.constructContent(i, obj), z);
        }
    }

    class b extends Handler {
        private b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                if (VoicePlayer.this.g.c() == 1 && VoicePlayer.this.d) {
                    VoicePlayer voicePlayer = VoicePlayer.this;
                    voicePlayer.a(voicePlayer.g.d());
                    VoicePlayer.this.d = false;
                    return;
                } else if (VoicePlayer.this.d) {
                    sendMessage(obtainMessage(2));
                    return;
                } else {
                    LogUtil.a("Track_VoicePlayer", "can not insert");
                    return;
                }
            }
            if (i != 2) {
                return;
            }
            if (VoicePlayer.this.g.b() || !VoicePlayer.this.d) {
                LogUtil.a("Track_VoicePlayer", "itemCount=", Integer.valueOf(VoicePlayer.this.g.c()), " mIsVoicePlayerIdle = ", Boolean.valueOf(VoicePlayer.this.d));
            } else {
                VoicePlayer.this.j.setVoiceIntentBufferState(false);
                VoicePlayer voicePlayer2 = VoicePlayer.this;
                voicePlayer2.a(voicePlayer2.g.d());
                VoicePlayer.this.d = false;
            }
        }
    }

    public void a(Intent intent) {
        if (intent == null || !"action_play_voice".equals(intent.getAction())) {
            LogUtil.e("Track_VoicePlayer", "managerVoiceIntent is null.");
            return;
        }
        int intExtra = intent.getIntExtra("SPEAK_TYPE", -1);
        ReleaseLogUtil.d("Track_VoicePlayer", a(intent, this.g.c()));
        if (intExtra == 10) {
            int intExtra2 = intent.getIntExtra("SPEAK_PARAMETER_TYPE", -1);
            if (intExtra2 == 0) {
                int intExtra3 = intent.getIntExtra("SPEAK_PARAMETER", -1);
                if (intExtra3 != -1) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(Integer.valueOf(intExtra3));
                    c(true, 10, arrayList);
                    return;
                }
                return;
            }
            if (intExtra2 != 1) {
                if (intExtra2 == 2) {
                    Object stringExtra = intent.getStringExtra("SPEAK_PARAMETER");
                    LogUtil.a("Track_VoicePlayer", "SPEAK_PARAMETER_TYPE_OTHER_RESOURCE play :", stringExtra);
                    c(true, 10, stringExtra);
                    return;
                } else if (intExtra2 != 3) {
                    LogUtil.j("Track_VoicePlayer", "Unkown resource type");
                    return;
                } else {
                    b(intent);
                    return;
                }
            }
            int[] intArrayExtra = intent.getIntArrayExtra("SPEAK_PARAMETER");
            if (intArrayExtra == null || intArrayExtra.length == 0) {
                LogUtil.e("Track_VoicePlayer", "voiceSourceIndexArray is empty");
                return;
            }
            ArrayList arrayList2 = new ArrayList(intArrayExtra.length);
            for (int i : intArrayExtra) {
                arrayList2.add(Integer.valueOf(i));
            }
            c(true, 10, arrayList2);
            return;
        }
        c(true, intExtra, intent.getSerializableExtra("SPEAK_PARAMETER"));
    }

    public String a(Intent intent, int i) {
        if (intent == null) {
            return null;
        }
        int intExtra = intent.getIntExtra("SPEAK_TYPE", -1);
        StringBuilder sb = new StringBuilder("Playing voice ");
        d(intent, intExtra, sb);
        sb.append(" Pieces of voice to play:");
        sb.append(i);
        return sb.toString();
    }

    private void d(Intent intent, int i, StringBuilder sb) {
        switch (i) {
            case -1:
                sb.append("VOICE INVALID");
                break;
            case 0:
                sb.append("START_BIKING");
                break;
            case 1:
                sb.append("START_RUNNING");
                break;
            case 2:
                sb.append("START_WALKING");
                break;
            case 3:
                sb.append("PAUSE_SPORT");
                break;
            case 4:
                sb.append("SPORT_OVER");
                break;
            case 5:
                sb.append("RESTART_SPORT");
                break;
            case 6:
                sb.append("GOAL_COMPLETE");
                break;
            case 7:
            case 8:
            default:
                a(intent, i, sb);
                break;
            case 9:
                sb.append("DISTANCE_TIME");
                Serializable serializableExtra = intent.getSerializableExtra("SPEAK_PARAMETER");
                if (serializableExtra instanceof jbc) {
                    jbc jbcVar = (jbc) serializableExtra;
                    sb.append(" SportType:");
                    sb.append(jaa.b(jbcVar.k()) + "ms Tip ");
                    sb.append(jbcVar.j());
                }
                break;
            case 10:
                sb.append("SPORT_SUGGEST_TYPE");
                break;
        }
    }

    private void a(Intent intent, int i, StringBuilder sb) {
        if (i == 111) {
            sb.append("START_HIKING");
            return;
        }
        if (i != 112) {
            switch (i) {
                case 11:
                    sb.append("SPORT_STATE_BROADCAST_TYPE");
                    Serializable serializableExtra = intent.getSerializableExtra("SPEAK_PARAMETER");
                    if (serializableExtra instanceof jbc) {
                        jbc jbcVar = (jbc) serializableExtra;
                        sb.append(" SportType:");
                        sb.append(jaa.b(jbcVar.k()) + "ms Tip ");
                        sb.append(jbcVar.j());
                    }
                    break;
                case 12:
                    sb.append("MARATHON_COMPLETE");
                    break;
                case 13:
                    sb.append("HALF_MARATHON_COMPLETE");
                    break;
                case 14:
                    sb.append("HEART_RATE_WARNING");
                    break;
                default:
                    switch (i) {
                        case 17:
                            sb.append("COUNT_DOWN");
                            break;
                        case 18:
                            sb.append("COUNT_DOWN_GOAL_FINISH");
                            break;
                        case 19:
                            sb.append("COUNT_DOWN_GOAL_FINISH");
                            break;
                        case 20:
                            sb.append("COUNT_DOWN_NUMBER_321");
                            break;
                        default:
                            sb.append("VOICE INVALID");
                            break;
                    }
                    break;
            }
            return;
        }
        sb.append("START_CLIMB_HILL");
    }

    private void b(Intent intent) {
        try {
            String[] stringArrayExtra = intent.getStringArrayExtra("SPEAK_PARAMETER");
            if (stringArrayExtra != null && stringArrayExtra.length != 0) {
                ArrayList arrayList = new ArrayList(stringArrayExtra.length);
                arrayList.addAll(Arrays.asList(stringArrayExtra));
                c(true, 10, arrayList);
                return;
            }
            LogUtil.j("Track_VoicePlayer", "voiceSourceIndexArrayString is null ");
        } catch (ArrayIndexOutOfBoundsException e) {
            LogUtil.a("Track_VoicePlayer", "speakMultiRes,", LogAnonymous.b(e));
        }
    }

    private void e(Context context) {
        LogUtil.a("Track_VoicePlayer", "initialize() enter");
        if (pqj.b().b(context, "Sport")) {
            this.f10487b = new jaz();
            this.f10488c = false;
        } else if (LanguageUtil.o(context)) {
            this.f10487b = new ChineseVoiceConstructor();
            this.f10488c = true;
        } else {
            this.f10487b = new EnglishVoiceConstructor();
            this.f10488c = false;
        }
        IVoiceContentConstructor iVoiceContentConstructor = this.f10487b;
        if (iVoiceContentConstructor instanceof ISoundResourceConstructor) {
            jas jasVar = new jas(context, ((ISoundResourceConstructor) iVoiceContentConstructor).getSoundResource());
            this.j = jasVar;
            jasVar.registerVoicePlayCompletionListener(this.e);
        }
    }
}
