package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportScheduleCallback;

/* JADX INFO: loaded from: classes2.dex */
final class i<T> implements Transport<T> {
    private final TransportContext a;
    private final String b;
    private final Encoding c;
    private final Transformer<T, byte[]> d;
    private final j e;

    public i(TransportContext transportContext, String str, Encoding encoding, Transformer<T, byte[]> transformer, j jVar) {
        this.a = transportContext;
        this.b = str;
        this.c = encoding;
        this.d = transformer;
        this.e = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Exception exc) {
    }

    @Override // com.google.android.datatransport.Transport
    public void schedule(Event<T> event, TransportScheduleCallback transportScheduleCallback) {
        this.e.send(SendRequest.a().setTransportContext(this.a).b(event).setTransportName(this.b).c(this.d).a(this.c).build(), transportScheduleCallback);
    }

    @Override // com.google.android.datatransport.Transport
    public void send(Event<T> event) {
        schedule(event, new TransportScheduleCallback() { // from class: com.google.android.datatransport.runtime.h
            @Override // com.google.android.datatransport.TransportScheduleCallback
            public final void onSchedule(Exception exc) {
                i.b(exc);
            }
        });
    }
}
