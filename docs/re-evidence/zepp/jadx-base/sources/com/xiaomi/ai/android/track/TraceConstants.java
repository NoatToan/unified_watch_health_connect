package com.xiaomi.ai.android.track;

/* JADX INFO: loaded from: classes18.dex */
public class TraceConstants {

    public static class Result {
        public static final String ASR_UPLOAD_RATE = "v5.app.asr.upload.rate";
        public static final String DUPLEX = "app.duplex";
        public static final String ERROR_CODE = "app.error.code";
        public static final String ERROR_MSG = "app.error.msg";
        public static final String QUERY_ORIGIN = "query.origin";
        public static final String TTS_UPLOAD_RATE = "v5.app.tts.upload.rate";
        public static final String TYPE = "type";
    }

    public static class TimeStamp {

        public static class ASR {
            public static final String FINAL_SIZE = "v5.app.asr.final.size";
            public static final String FINISH_TALKING_OFFSET = "v5.app.asr.finish.talking.offset";
            public static final String OPEN_MIC = "v5.app.asr.open.mic";
            public static final String RECV_FINAL = "v5.app.asr.recv.final";
            public static final String RECV_FIRST_PARTIAL = "v5.app.asr.recv.first.partial";
            public static final String RECV_FIRST_TEXT = "v5.app.asr.recv.first.text";
            public static final String RECV_SYSTEM_TRUNCATIONNOTIFICATION = "v5.app.asr.recv.system.truncationnotification";
            public static final String SEND_FIRST_BINARY = "v5.app.asr.send.first.binary";
            public static final String SEND_LAST_BINARY = "v5.app.asr.send.last.binary";
            public static final String SEND_RECOGNIZER_RECOGNIZE = "v5.app.asr.send.recognizer.recognize";
            public static final String SEND_RECOGNIZER_RECOGNIZEFINISHED = "v5.app.asr.send.recognizer.recognizefinished";
            public static final String START_TALKING_OFFSET = "v5.app.asr.start.talking.offset";
        }

        public static class EXEC {
            public static final String SEND_LAUNCHAPP_INTENT = "v5.app.exec.send.launchapp.intent";
            public static final String START_PLAY_MUSIC = "v5.app.exec.start.play.music";
            public static final String START_PLAY_VIDEO = "v5.app.exec.start.play.video";
            public static final String UI_CARD = "v5.app.exec.ui.card";
            public static final String UI_PAGE = "v5.app.exec.ui.page";
            public static final String UI_TOAST = "v5.app.exec.ui.toast";
        }

        public static class NLP {
            public static final String RECV_FINISHANSWER = "v5.app.nlp.recv.finishanswer";
            public static final String RECV_SPEAK_STREAM = "v5.app.nlp.recv.speak.stream";
            public static final String RECV_SPEAK_URL = "v5.app.nlp.recv.speak.url";
            public static final String RECV_STARTANSWER = "v5.app.nlp.recv.startanswer";
        }

        public static class TTS {
            public static final String DIALOG_FINISH = "v5.app.dialog.finish";
            public static final String RECV_FIRST_BINARY = "v5.app.tts.recv.first.binary";
            public static final String RECV_SYNTHESIZER_FINISHSPEAKSTREAM = "v5.app.tts.recv.synthesizer.finishspeakstream";
            public static final String START_PLAY_STREAM = "v5.app.tts.start.play.stream";
            public static final String START_PLAY_URL = "v5.app.tts.start.play.url";
        }

        public static class Wakeup {
            public static final String AFTER_TALK_XUE = "v5.app.wakeup.after.talk.xue";
            public static final String BALL_APPEAR = "v5.app.wakeup.ball.appear";
            public static final String FRONTEND_ALGO_BEGIN = "v5.app.wakeup.frontend.algo.begin";
            public static final String FRONTEND_ALGO_END = "v5.app.wakeup.frontend.algo.end";
            public static final String LEVEL1_FINISH = "v5.app.wakeup.level1.finish";
            public static final String LEVEL2_FINISH = "v5.app.wakeup.level2.finish";
            public static final String NEAR_AWAKEN_BEGIN = "v5.app.wakeup.near.awaken.begin";
            public static final String NEAR_AWAKEN_END = "v5.app.wakeup.near.awaken.end";
            public static final String RECV_SUCC_EVENT = "v5.app.wakeup.recv.succ.event";
            public static final String SAY_HI = "v5.app.wakeup.say.hi";
            public static final String SEND_FIRST_BINARY = "v5.app.wakeup.send.first.binary";
            public static final String SEND_LAST_BINARY = "v5.app.wakeup.send.last.binary";
            public static final String SEND_SUCC_EVENT = "v5.app.wakeup.send.succ.event";
            public static final String TV_CONTROLLER_KEYDOWN = "v5.app.wakeup.tv.controller.keydown";
            public static final String TV_CONTROLLER_SHORTPRESS = "v5.app.wakeup.tv.controller.shortpress";
            public static final String WATCH_ICON_ONCREATE = "v5.app.wakeup.watch.icon.oncreate";
        }
    }
}
