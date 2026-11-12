package com.fasterxml.jackson.core.async;

/* JADX INFO: loaded from: classes21.dex */
public interface NonBlockingInputFeeder {
    void endOfInput();

    boolean needMoreInput();
}
