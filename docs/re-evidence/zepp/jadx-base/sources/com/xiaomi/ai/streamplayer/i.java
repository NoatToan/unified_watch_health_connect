package com.xiaomi.ai.streamplayer;

import java.io.PipedInputStream;

/* JADX INFO: loaded from: classes18.dex */
abstract class i {
    public j b;
    public PipedInputStream c;
    public boolean d;

    public void a() {
        if (this.c == null) {
            throw new RuntimeException(" please setPipedInputStream first!!");
        }
    }

    public void a(j jVar) {
        this.b = jVar;
    }

    public void a(PipedInputStream pipedInputStream) {
        this.c = pipedInputStream;
    }

    public void b() {
        if (this.c == null) {
            throw new RuntimeException(" please setPipedInputStream first!!");
        }
    }

    public boolean c() {
        return this.d;
    }
}
