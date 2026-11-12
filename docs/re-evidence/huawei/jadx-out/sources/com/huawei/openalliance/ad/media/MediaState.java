package com.huawei.openalliance.ad.media;

import com.huawei.openalliance.ad.hw;
import com.huawei.operation.utils.Constants;

/* JADX INFO: loaded from: classes12.dex */
public class MediaState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private State f19602a = State.IDLE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f19603b = new byte[0];

    public enum State {
        END(-2),
        ERROR(-1),
        IDLE(0),
        INITIALIZED(1),
        PREPARING(2),
        PREPARED(3),
        PLAYING(4),
        PAUSED(5),
        PLAYBACK_COMPLETED(6);

        int code;

        @Override // java.lang.Enum
        public String toString() {
            return name() + Constants.LEFT_BRACKET_ONLY + this.code + Constants.RIGHT_BRACKET_ONLY;
        }

        public int getCode() {
            return this.code;
        }

        State(int i) {
            this.code = i;
        }
    }

    public String toString() {
        String string;
        synchronized (this.f19603b) {
            string = this.f19602a.toString();
        }
        return string;
    }

    public boolean isState(State state) {
        boolean z;
        synchronized (this.f19603b) {
            z = this.f19602a == state;
        }
        return z;
    }

    public boolean isNotState(State state) {
        return !isState(state);
    }

    public int getStateCode() {
        int code;
        synchronized (this.f19603b) {
            code = this.f19602a.getCode();
        }
        return code;
    }

    public boolean a() {
        boolean z;
        synchronized (this.f19603b) {
            int i = AnonymousClass1.f19604a[this.f19602a.ordinal()];
            z = true;
            if (i != 1 && i != 2 && i != 3 && i != 4) {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: com.huawei.openalliance.ad.media.MediaState$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19604a;

        static {
            int[] iArr = new int[State.values().length];
            f19604a = iArr;
            try {
                iArr[State.PREPARED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19604a[State.PLAYING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19604a[State.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19604a[State.PLAYBACK_COMPLETED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public void a(State state) {
        if (state == null) {
            return;
        }
        synchronized (this.f19603b) {
            if (this.f19602a != State.END) {
                hw.b("MediaState", "switchToState: %s", state);
                this.f19602a = state;
            }
        }
    }
}
