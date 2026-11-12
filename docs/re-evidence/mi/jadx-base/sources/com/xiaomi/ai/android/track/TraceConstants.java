package com.xiaomi.ai.android.track;

/* JADX INFO: loaded from: classes6.dex */
public class TraceConstants {
    public static final String UTILITY_CLASS = "Utility class";

    public static class Result {
        public static final String AITWINS_STATUS = "v5.app.aitwins.status";
        public static final String ASR_UPLOAD_RATE = "v5.app.asr.upload.rate";
        public static final String CP = "cp";
        public static final String DUPLEX = "app.duplex";
        public static final String ERROR_CODE = "app.error.code";
        public static final String ERROR_MSG = "app.error.msg";
        public static final String IS_PLAYING = "is.playing";
        public static final String LANG = "v5.app.lang";
        public static final String QUERY_ORIGIN = "query.origin";
        public static final String SCREEN_STATUS = "v5.app.screen.status";
        public static final String SHORTCUT_STATUS = "v5.app.shortcut.status";
        public static final String TTS_UPLOAD_RATE = "v5.app.tts.upload.rate";
        public static final String TYPE = "type";
        public static final String WAKEUP_WORD = "v5.app.wakeupword";

        private Result() {
            throw new IllegalStateException(TraceConstants.UTILITY_CLASS);
        }
    }

    public static class TimeStamp {

        public static class ASR {
            public static final String AUTO_OPEN_MIC = "v5.app.asr.auto.open.mic";
            public static final String FINAL_SIZE = "v5.app.asr.final.size";
            public static final String FINISH_TALKING_OFFSET = "v5.app.asr.finish.talking.offset";
            public static final String OFFLINE_RECV_FINAL = "v5.app.asr.offline.recv.final";
            public static final String OPEN_MIC = "v5.app.asr.open.mic";
            public static final String READ_AUDIORECORD_FIRST_FRAME = "v5.app.asr.read.audiorecord.first.frame";
            public static final String RECV_FINAL = "v5.app.asr.recv.final";
            public static final String RECV_FINAL_SPEAK_FINISH = "v5.app.asr.recv.final.speak.finish";
            public static final String RECV_FIRST_PARTIAL = "v5.app.asr.recv.first.partial";
            public static final String RECV_FIRST_TEXT = "v5.app.asr.recv.first.text";
            public static final String RECV_LAST_PARTIAL_FOR_NLP = "v5.app.asr.recv.last.partial.for.nlp";
            public static final String RECV_SPEAK_FINISH = "v5.app.asr.recv.speak.finish";
            public static final String RECV_SYSTEM_TRUNCATIONNOTIFICATION = "v5.app.asr.recv.system.truncationnotification";
            public static final String SEND_FIRST_BINARY = "v5.app.asr.send.first.binary";
            public static final String SEND_FIRST_NON_BLANK_AUDIO_BINARY = "v5.app.asr.send.first.non.blank.audio.binary";
            public static final String SEND_LAST_BINARY = "v5.app.asr.send.last.binary";
            public static final String SEND_LAST_BINARY_SDK_CALLBACK = "v5.app.asr.send.last.binary.sdk.callback";
            public static final String SEND_RECOGNIZER_RECOGNIZE = "v5.app.asr.send.recognizer.recognize";
            public static final String SEND_RECOGNIZER_RECOGNIZEFINISHED = "v5.app.asr.send.recognizer.recognizefinished";
            public static final String START_TALKING_OFFSET = "v5.app.asr.start.talking.offset";

            private ASR() {
                throw new IllegalStateException(TraceConstants.UTILITY_CLASS);
            }
        }

        public static class Custom {
            public static final String APP_ATTACH_BASE_CONTEXT = "v5.app.custom.app.attachbasecontext";
            public static final String APP_CREATE = "v5.app.custom.app.create";
            public static final String APP_INIT_AFTER_CTA = "v5.app.custom.app.initaftercta";
            public static final String APP_INIT_BEFORE_CTA = "v5.app.custom.app.initbeforecta";
            public static final String FLOATMANAGER_ADDWINDOW = "v5.app.custom.floatmanager.addwindow";
            public static final String FLOATMANAGER_INITVIEW = "v5.app.custom.floatmanager.initview";
            public static final String UI_DRAW_FINISH = "v5.app.custom.ui.draw.finish";
            public static final String UI_DRAW_START = "v5.app.custom.ui.draw.start";
            public static final String VOICE_SERVICE_COMMAND_START = "v5.app.custom.voiceservice.commandstart";
            public static final String VOICE_SERVICE_CREATE_START = "v5.app.custom.voiceservice.createstart";
            public static final String VOICE_SERVICE_HANDLE_INTENT = "v5.app.custom.voiceservice.handleintent";

            private Custom() {
                throw new IllegalStateException(TraceConstants.UTILITY_CLASS);
            }
        }

        public static class EXEC {
            public static final String CANCEL = "v5.app.exec.cancel";
            public static final String CHECK_SCREEN_UNLOCK = "v5.app.exec.check.screeeunlock";
            public static final String FINISH_TRACE = "v5.app.exec.finish.trace";
            public static final String SEND_INTENT_TO_MUSICAPP = "v5.app.exec.send.intent.to.musicapp";
            public static final String SEND_INTENT_TO_VEDIOAPP = "v5.app.exec.send.intent.to.videoapp";
            public static final String SEND_LAUNCHAPP_INTENT = "v5.app.exec.send.launchapp.intent";
            public static final String SEND_LAUNCHAPP_INTENT_LAUNCHAPP = "v5.app.exec.send.launchapp.intent.launchapp";
            public static final String SEND_LAUNCHAPP_INTENT_OPERATE = "v5.app.exec.send.launchapp.intent.operate";
            public static final String SEND_LAUNCHAPP_INTENT_PLANROUTE = "v5.app.exec.send.launchapp.intent.planroute";
            public static final String START_PLAY_ANCIENT_POEM = "v5.app.exec.start.play.ancient.poem";
            public static final String START_PLAY_BOOKS = "v5.app.exec.start.play.books";
            public static final String START_PLAY_JOKE = "v5.app.exec.start.play.joke";
            public static final String START_PLAY_MUSIC = "v5.app.exec.start.play.music";
            public static final String START_PLAY_NEWS = "v5.app.exec.start.play.news";
            public static final String START_PLAY_RADIO_STATION = "v5.app.exec.start.play.radio.station";
            public static final String START_PLAY_TRANSLATION = "v5.app.exec.start.play.translation";
            public static final String START_PLAY_VIDEO = "v5.app.exec.start.play.video";
            public static final String START_PLAY_VOICE = "v5.app.exec.start.play.voice";
            public static final String START_PLAY_WHITE_NOISE = "v5.app.exec.start.play.white.noise";
            public static final String UI_CARD = "v5.app.exec.ui.card";
            public static final String UI_CARD_ANIMATION_END = "v5.app.exec.ui.card.animation.end";
            public static final String UI_H5_FINISH_DRAWING = "v5.app.exec.ui.h5.finish.drawing";
            public static final String UI_H5_START = "v5.app.exec.ui.h5.view.start";
            public static final String UI_PAGE = "v5.app.exec.ui.page";
            public static final String UI_TOAST = "v5.app.exec.ui.toast";

            private EXEC() {
                throw new IllegalStateException(TraceConstants.UTILITY_CLASS);
            }
        }

        public static class NLP {
            public static final String OFFLINE_RECV_FINISHANSWER = "v5.app.nlp.offline.recv.finishanswer";
            public static final String RECV_FINISHANSWER = "v5.app.nlp.recv.finishanswer";
            public static final String RECV_SPEAK_STREAM = "v5.app.nlp.recv.speak.stream";
            public static final String RECV_SPEAK_URL = "v5.app.nlp.recv.speak.url";
            public static final String RECV_STARTANSWER = "v5.app.nlp.recv.startanswer";

            private NLP() {
                throw new IllegalStateException(TraceConstants.UTILITY_CLASS);
            }
        }

        public static class TTS {
            public static final String DIALOG_FINISH = "v5.app.dialog.finish";
            public static final String RECV_FIRST_BINARY = "v5.app.tts.recv.first.binary";
            public static final String RECV_SYNTHESIZER_FINISHSPEAKSTREAM = "v5.app.tts.recv.synthesizer.finishspeakstream";
            public static final String START_PLAY_STREAM = "v5.app.tts.start.play.stream";
            public static final String START_PLAY_URL = "v5.app.tts.start.play.url";

            private TTS() {
                throw new IllegalStateException(TraceConstants.UTILITY_CLASS);
            }
        }

        public static class Wakeup {
            public static final String AFTER_TALK_XUE = "v5.app.wakeup.after.talk.xue";
            public static final String BALL_ANIMATION_END = "v5.app.wakeup.ball.animation.end";
            public static final String BALL_APPEAR = "v5.app.wakeup.ball.appear";
            public static final String FRONTEND_ALGO_BEGIN = "v5.app.wakeup.frontend.algo.begin";
            public static final String FRONTEND_ALGO_END = "v5.app.wakeup.frontend.algo.end";
            public static final String LEVEL1_FINISH = "v5.app.wakeup.level1.finish";
            public static final String LEVEL2_FINISH = "v5.app.wakeup.level2.finish";
            public static final String NEAR_AWAKEN_BEGIN = "v5.app.wakeup.near.awaken.begin";
            public static final String NEAR_AWAKEN_END = "v5.app.wakeup.near.awaken.end";
            public static final String PREPLAY = "v5.app.wakeup.preplay";
            public static final String RECV_SUCC_EVENT = "v5.app.wakeup.recv.succ.event";
            public static final String SAY_HI = "v5.app.wakeup.say.hi";
            public static final String SAY_HI_END = "v5.app.wakeup.say.hi.end";
            public static final String SEND_BINARY_TO_LOCAL_SERVICE = "v5.app.wakeup.send.binary.to.local.service";
            public static final String SEND_FIRST_BINARY = "v5.app.wakeup.send.first.binary";
            public static final String SEND_LAST_BINARY = "v5.app.wakeup.send.last.binary";
            public static final String SEND_SUCC_EVENT = "v5.app.wakeup.send.succ.event";
            public static final String TV_CONTROLLER_CANCEL = "v5.app.wakeup.tv.controller.cancel";
            public static final String TV_CONTROLLER_KEYDOWN = "v5.app.wakeup.tv.controller.keydown";
            public static final String TV_CONTROLLER_KEYUP = "v5.app.wakeup.tv.controller.keyup";
            public static final String TV_CONTROLLER_SHORTPRESS = "v5.app.wakeup.tv.controller.shortpress";
            public static final String VT_VERSION_CODE = "v5.app.wakeup.vt.version.code";
            public static final String VT_VERSION_NAME = "v5.app.wakeup.vt.version.name";
            public static final String WATCH_ICON_ONCREATE = "v5.app.wakeup.watch.icon.oncreate";

            private Wakeup() {
                throw new IllegalStateException(TraceConstants.UTILITY_CLASS);
            }
        }

        private TimeStamp() {
            throw new IllegalStateException(TraceConstants.UTILITY_CLASS);
        }
    }

    private TraceConstants() {
        throw new IllegalStateException("UTILITY_CLASS");
    }
}
