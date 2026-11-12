package com.xiaomi.ai.streamplayer;

import android.media.AudioTrack;
import com.xiaomi.ai.PCMInfo;
import com.xiaomi.ai.utils.Log;

/* JADX INFO: loaded from: classes18.dex */
public class k {
    private static final String a = "MiSpeechSDK:StramingPlayer";
    private static final int c = 1;
    private static final int d = 2;
    private static final int e = 3;
    private static final int f = 3;
    private a h;
    private com.xiaomi.ai.streamplayer.a j;
    private int k;
    private boolean b = false;
    private b i = new b();
    private int g = 1;
    private int l = 1;

    public interface a {
        void a(k kVar);

        void a(k kVar, int i, String str);

        void a(k kVar, AudioTrack audioTrack);

        void a(k kVar, PCMInfo pCMInfo);
    }

    public class b extends Thread {
        public final int a;
        public int b;
        public int c;
        private AudioTrack e;

        private b() {
            this.a = 5;
            this.c = 0;
        }

        private void a() {
            if (this.e != null) {
                try {
                    if (k.this.l == 1) {
                        this.e.stop();
                    }
                } catch (Exception unused) {
                }
                synchronized (this) {
                    this.e.release();
                    this.e = null;
                    Log.d(k.a, "releaseAudioTrack");
                }
            }
        }

        private void a(byte[] bArr) {
            if (this.e == null || bArr == null || k.this.b) {
                return;
            }
            this.e.write(bArr, 0, bArr.length);
        }

        private boolean a(int i, int i2) {
            AudioTrack audioTrack;
            if (i2 == 1) {
                audioTrack = new AudioTrack(k.this.k, i, 4, 2, AudioTrack.getMinBufferSize(i, 4, 2), 1);
            } else {
                if (i2 != 2) {
                    throw new IllegalArgumentException("not supported chanel numbers" + i2);
                }
                audioTrack = new AudioTrack(k.this.k, i, 12, 2, AudioTrack.getMinBufferSize(i, 12, 2), 1);
            }
            this.e = audioTrack;
            if (this.e.getState() != 0) {
                if (k.this.l == 1) {
                    this.e.play();
                }
                return true;
            }
            if (k.this.h == null) {
                return false;
            }
            k.this.h.a(k.this, 15, "STATE_UNINITIALIZED");
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            AudioTrack audioTrack = this.e;
            synchronized (this) {
                if (audioTrack != null) {
                    try {
                        if (k.this.l == 1) {
                            audioTrack.pause();
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }

        private void c() {
            if (this.e == null || k.this.b) {
                return;
            }
            this.e.flush();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0040  */
        /* JADX WARN: Code duplicated, block: B:19:0x004a  */
        /* JADX WARN: Code duplicated, block: B:20:0x004c  */
        /* JADX WARN: Code duplicated, block: B:22:0x0050  */
        /* JADX WARN: Code duplicated, block: B:27:0x0069  */
        /* JADX WARN: Code duplicated, block: B:29:0x0071  */
        /* JADX WARN: Code duplicated, block: B:30:0x0091  */
        /* JADX WARN: Code duplicated, block: B:34:0x009b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:35:0x009d  */
        /* JADX WARN: Code duplicated, block: B:40:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:52:0x00d3 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:61:0x00ec A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:68:0x00fd  */
        /* JADX WARN: Code duplicated, block: B:72:0x0109  */
        /* JADX WARN: Code duplicated, block: B:90:0x0124 A[EDGE_INSN: B:90:0x0124->B:81:0x0124 BREAK  A[LOOP:0: B:3:0x000f->B:77:0x011e], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:91:0x00a1 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:92:0x0124 A[EDGE_INSN: B:92:0x0124->B:81:0x0124 BREAK  A[LOOP:0: B:3:0x000f->B:77:0x011e], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:96:0x011e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            AudioTrack audioTrack;
            AudioTrack audioTrack2;
            super.run();
            int i = k.this.l;
            boolean z = false;
            com.xiaomi.ai.streamplayer.a.C0772a c0772a = null;
            boolean z2 = false;
            int length = 0;
            int i2 = 0;
            while (!k.this.b) {
                k kVar = k.this;
                if (!z) {
                    com.xiaomi.ai.streamplayer.a.C0772a c0772aE = kVar.j.e();
                    if (c0772aE != null && c0772aE.b > 0 && !c0772aE.a(c0772a)) {
                        a();
                        if (!a(c0772aE.a, c0772aE.b)) {
                            break;
                        }
                        if (!k.this.b) {
                            break;
                            break;
                        }
                        if (c0772aE != null) {
                            if (c0772aE.e != null) {
                                if (k.this.h != null) {
                                    k.this.h.a(k.this, this.e);
                                }
                                if (i == 2) {
                                    a(c0772aE.e);
                                } else if (k.this.h != null) {
                                    length += c0772aE.e.length;
                                    k.this.h.a(k.this, new PCMInfo(c0772aE.a, c0772aE.b, c0772aE.c, c0772aE.d, c0772aE.e));
                                }
                                z2 = true;
                            }
                            z = c0772aE.d;
                            if (z) {
                                if (i == 1) {
                                    c();
                                }
                                k.this.h.a(k.this);
                                break;
                            }
                        }
                        if (!k.this.b) {
                            break;
                            break;
                        }
                        c0772a = c0772aE;
                        if (z2) {
                            this.c++;
                        }
                        if (i == 2) {
                            this.c++;
                        }
                        if (z2) {
                            this.b = audioTrack.getPlaybackHeadPosition();
                        }
                        if (!z) {
                        }
                        i2 = length;
                    } else {
                        if (!k.this.b) {
                            break;
                        }
                        if (c0772aE != null) {
                            if (c0772aE.e != null) {
                                if (k.this.h != null && !z2) {
                                    k.this.h.a(k.this, this.e);
                                }
                                if (i == 2) {
                                    a(c0772aE.e);
                                } else if (k.this.h != null) {
                                    length += c0772aE.e.length;
                                    k.this.h.a(k.this, new PCMInfo(c0772aE.a, c0772aE.b, c0772aE.c, c0772aE.d, c0772aE.e));
                                }
                                z2 = true;
                            }
                            z = c0772aE.d;
                            if (z) {
                                if (i == 1) {
                                    c();
                                }
                                k.this.h.a(k.this);
                                break;
                            }
                        }
                        if (!k.this.b) {
                            c0772a = c0772aE;
                            if (z2 && z && (audioTrack2 = this.e) != null && this.b != 0 && audioTrack2.getPlaybackHeadPosition() == this.b) {
                                this.c++;
                            }
                            if (i == 2 && z2 && z && this.e != null && length == i2) {
                                this.c++;
                            }
                            if (z2 && (audioTrack = this.e) != null) {
                                this.b = audioTrack.getPlaybackHeadPosition();
                            }
                            if (!z && this.c >= 5) {
                                Log.e(k.a, "on end");
                                if (k.this.h == null) {
                                    break;
                                }
                                k.this.h.a(k.this);
                                break;
                            }
                            i2 = length;
                        } else {
                            break;
                        }
                    }
                } else {
                    if (kVar.b) {
                        break;
                    }
                    try {
                        synchronized (this) {
                            wait(40L);
                        }
                        if (k.this.b) {
                            break;
                        }
                        if (z2) {
                            this.c++;
                        }
                        if (i == 2) {
                            this.c++;
                        }
                        if (z2) {
                            this.b = audioTrack.getPlaybackHeadPosition();
                        }
                        if (!z) {
                        }
                        i2 = length;
                    } catch (InterruptedException unused) {
                    }
                }
            }
            a();
            k.this.j.b();
            Log.e(k.a, "release decoder and track");
        }

        @Override // java.lang.Thread
        public void start() {
            super.start();
        }
    }

    public k(int i) {
        this.k = i;
    }

    public synchronized void a() {
        if (this.g == 2 && !this.b) {
            this.b = false;
            this.g = 3;
            this.j.a();
            this.i.start();
        }
    }

    public void a(int i) {
        this.l = i;
    }

    public void a(a aVar) {
        this.h = aVar;
    }

    public synchronized void a(String str) {
        if (!"mp3".equalsIgnoreCase(str)) {
            throw new RuntimeException("not supported  tts codec !!");
        }
        this.j = TTSDecoderConfig.sUseHardDecoder ? new d() : new f();
        this.g = 2;
    }

    public void a(byte[] bArr, int i, int i2) {
        this.j.a(bArr, i, i2);
    }

    public synchronized void b() {
        if (this.g != 3) {
            return;
        }
        this.j.d();
        this.g = 3;
    }

    public synchronized void c() {
        this.b = true;
        this.i.b();
        b();
        this.j.c();
    }
}
