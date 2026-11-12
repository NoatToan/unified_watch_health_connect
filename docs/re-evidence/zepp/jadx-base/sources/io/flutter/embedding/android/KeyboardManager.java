package io.flutter.embedding.android;

import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.NonNull;
import io.flutter.Log;
import io.flutter.plugin.editing.TextInputPlugin;
import java.util.HashSet;

/* JADX INFO: loaded from: classes22.dex */
public class KeyboardManager {
    private static final String TAG = "KeyboardManager";

    @NonNull
    private final HashSet<KeyEvent> redispatchedEvents = new HashSet<>();

    @NonNull
    public final Responder[] responders;

    @NonNull
    private final TextInputPlugin textInputPlugin;
    private final View view;

    public class PerEventCallbackBuilder {
        public boolean isEventHandled = false;

        @NonNull
        public final KeyEvent keyEvent;
        public int unrepliedCount;

        public class Callback implements Responder.OnKeyEventHandledCallback {
            public boolean isCalled;

            private Callback() {
                this.isCalled = false;
            }

            @Override // io.flutter.embedding.android.KeyboardManager.Responder.OnKeyEventHandledCallback
            public void onKeyEventHandled(Boolean bool) {
                if (this.isCalled) {
                    throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
                }
                this.isCalled = true;
                PerEventCallbackBuilder perEventCallbackBuilder = PerEventCallbackBuilder.this;
                perEventCallbackBuilder.unrepliedCount--;
                perEventCallbackBuilder.isEventHandled = bool.booleanValue() | perEventCallbackBuilder.isEventHandled;
                PerEventCallbackBuilder perEventCallbackBuilder2 = PerEventCallbackBuilder.this;
                if (perEventCallbackBuilder2.unrepliedCount != 0 || perEventCallbackBuilder2.isEventHandled) {
                    return;
                }
                KeyboardManager.this.onUnhandled(perEventCallbackBuilder2.keyEvent);
            }
        }

        public PerEventCallbackBuilder(KeyEvent keyEvent) {
            this.unrepliedCount = KeyboardManager.this.responders.length;
            this.keyEvent = keyEvent;
        }

        public Responder.OnKeyEventHandledCallback buildCallback() {
            return new Callback();
        }
    }

    public interface Responder {

        public interface OnKeyEventHandledCallback {
            void onKeyEventHandled(Boolean bool);
        }

        void handleEvent(@NonNull KeyEvent keyEvent, @NonNull OnKeyEventHandledCallback onKeyEventHandledCallback);
    }

    public KeyboardManager(View view, @NonNull TextInputPlugin textInputPlugin, Responder[] responderArr) {
        this.view = view;
        this.textInputPlugin = textInputPlugin;
        this.responders = responderArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUnhandled(@NonNull KeyEvent keyEvent) {
        if (this.textInputPlugin.handleKeyEvent(keyEvent) || this.view == null) {
            return;
        }
        this.redispatchedEvents.add(keyEvent);
        this.view.getRootView().dispatchKeyEvent(keyEvent);
        if (this.redispatchedEvents.remove(keyEvent)) {
            Log.w(TAG, "A redispatched key event was consumed before reaching KeyboardManager");
        }
    }

    public void destroy() {
        int size = this.redispatchedEvents.size();
        if (size > 0) {
            Log.w(TAG, "A KeyboardManager was destroyed with " + String.valueOf(size) + " unhandled redispatch event(s).");
        }
    }

    public boolean handleEvent(@NonNull KeyEvent keyEvent) {
        if (this.redispatchedEvents.remove(keyEvent)) {
            return false;
        }
        if (this.responders.length <= 0) {
            onUnhandled(keyEvent);
            return true;
        }
        PerEventCallbackBuilder perEventCallbackBuilder = new PerEventCallbackBuilder(keyEvent);
        for (Responder responder : this.responders) {
            responder.handleEvent(keyEvent, perEventCallbackBuilder.buildCallback());
        }
        return true;
    }
}
