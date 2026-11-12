package com.xiaomi.smarthome.screenshot;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.webkit.WebView;
import com.xiaomi.smarthome.screenshot.callback.ScreenshotListener;
import com.xiaomi.smarthome.screenshot.callback.ScrollListener;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class Screenshot {
    private static final int FAIL_STATE = 200;
    private static final Object LOCK = new Object();
    public static final int PARAMS_ERROR = 1001;
    private static final int SCROLL_STATE = 300;
    private static final int START_STATE = 400;
    private static final int SUCCESS_STATE = 100;
    private static final String TAG = "com.xiaomi.smarthome.screenshot.Screenshot";
    private volatile int contentHeight;
    private Context context;
    private String filePath;
    private volatile ScreenshotHandler handler;
    private int height;
    private boolean isLongScreenshot;
    private ScreenshotListener listener;
    private Thread mThread;
    private volatile int remainScrollHeight;
    private LongScreenshotRunabable runabable;
    private ScrollListener scrollListener;
    private volatile Bitmap tempBitmap;
    private volatile int totalScrollCount;
    private View view;

    public static class Builder {
        private Context context;
        private String filePath;
        private boolean isLongScreenshot;
        private ScreenshotListener listener;
        private View view;

        public Builder(Context context) {
            this.context = context;
        }

        public Screenshot build() {
            return new Screenshot(this);
        }

        public Builder setFilePath(String str) {
            this.filePath = str;
            return this;
        }

        public Builder setScreenshotListener(ScreenshotListener screenshotListener) {
            this.listener = screenshotListener;
            return this;
        }

        public Builder setScreenshotType(boolean z) {
            this.isLongScreenshot = z;
            return this;
        }

        public Builder setTarget(View view) {
            this.view = view;
            return this;
        }
    }

    public class LongScreenshotRunabable implements Runnable {
        private volatile boolean isDestory = false;

        public LongScreenshotRunabable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                synchronized (Screenshot.LOCK) {
                    try {
                        ArrayList<Bitmap> arrayList = new ArrayList();
                        int i = Screenshot.this.totalScrollCount;
                        if (Screenshot.this.remainScrollHeight > 0) {
                            i++;
                        }
                        for (int i2 = 0; i2 < i; i2++) {
                            if (Thread.currentThread().isInterrupted()) {
                                return;
                            }
                            if (this.isDestory) {
                                break;
                            }
                            if (i2 == 0) {
                                Screenshot.this.handler.sendScrollMessage(0);
                            } else {
                                Screenshot.this.handler.sendScrollMessage(Screenshot.this.height);
                            }
                            try {
                                Screenshot.LOCK.wait();
                                arrayList.add(ScreenshotUtils.compressBitmap(Screenshot.this.tempBitmap));
                                Screenshot.this.tempBitmap.recycle();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                                for (Bitmap bitmap : arrayList) {
                                    if (bitmap != null && !bitmap.isRecycled()) {
                                        bitmap.recycle();
                                    }
                                }
                                return;
                            }
                        }
                        if (!this.isDestory) {
                            Bitmap bitmapMergeBitmap = ScreenshotUtils.mergeBitmap(arrayList, Screenshot.this.contentHeight, Screenshot.this.remainScrollHeight);
                            Screenshot.this.savaBitmap(bitmapMergeBitmap);
                            for (Bitmap bitmap2 : arrayList) {
                                if (bitmap2 != null && !bitmap2.isRecycled()) {
                                    bitmap2.recycle();
                                }
                            }
                            Screenshot.this.handler.sendSuccessMessage(bitmapMergeBitmap);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public class ScreenshotHandler extends Handler {
        public ScreenshotHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 100) {
                Bitmap bitmap = (Bitmap) message.obj;
                if (Screenshot.this.listener != null) {
                    Screenshot.this.listener.onSuccess(bitmap, Screenshot.this.isLongScreenshot);
                }
                Screenshot.this.switchWebViewScrollBar(message.what);
                return;
            }
            if (i == 200) {
                int i2 = message.arg1;
                String str = (String) message.obj;
                if (Screenshot.this.listener != null) {
                    Screenshot.this.listener.onFail(i2, str);
                }
                Screenshot.this.switchWebViewScrollBar(message.what);
                return;
            }
            if (i == 300) {
                Screenshot.this.startScrollAnimat(message.arg1);
            } else {
                if (i != 400) {
                    return;
                }
                if (Screenshot.this.listener != null) {
                    Screenshot.this.listener.onPreStart();
                }
                Screenshot.this.switchWebViewScrollBar(message.what);
            }
        }

        public void sendFailMessage(int i, String str) {
            Message messageObtainMessage = obtainMessage(100);
            messageObtainMessage.arg1 = i;
            messageObtainMessage.obj = str;
            sendMessage(messageObtainMessage);
        }

        public void sendScrollMessage(int i) {
            Message messageObtainMessage = obtainMessage(300);
            messageObtainMessage.arg1 = i;
            sendMessage(messageObtainMessage);
        }

        public void sendStartMessage() {
            obtainMessage(400).sendToTarget();
        }

        public void sendSuccessMessage(Bitmap bitmap) {
            Message messageObtainMessage = obtainMessage(100);
            messageObtainMessage.obj = bitmap;
            sendMessage(messageObtainMessage);
        }
    }

    private String checkParams() {
        if (this.context == null) {
            return "context not null";
        }
        return this.view == null ? "target view not null" : "";
    }

    private void longScreenshot() {
        this.runabable = new LongScreenshotRunabable();
        Thread thread = new Thread(this.runabable);
        this.mThread = thread;
        thread.start();
    }

    private void preLongScreenshot() {
        this.handler.sendStartMessage();
        this.height = this.view.getHeight();
        this.view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.contentHeight = this.view.getMeasuredHeight();
        this.totalScrollCount = this.contentHeight / this.height;
        this.remainScrollHeight = this.contentHeight - (this.totalScrollCount * this.height);
        longScreenshot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void savaBitmap(Bitmap bitmap) throws Throwable {
        if (TextUtils.isEmpty(this.filePath)) {
            return;
        }
        ScreenshotUtils.saveBitmap(bitmap, this.filePath);
    }

    private void screenshot() throws Throwable {
        Bitmap bitmapCompressBitmap = ScreenshotUtils.compressBitmap(ScreenshotUtils.getScreenshot(this.view));
        savaBitmap(bitmapCompressBitmap);
        this.handler.sendSuccessMessage(bitmapCompressBitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startScrollAnimat(int i) {
        final int scrollY = this.view.getScrollY();
        if (i <= 0) {
            Object obj = LOCK;
            synchronized (obj) {
                this.scrollListener.onSuccess();
                obj.notify();
            }
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, i);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.setDuration(1000L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xiaomi.smarthome.screenshot.Screenshot.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Screenshot.this.view.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue() + scrollY);
            }
        });
        valueAnimatorOfInt.addListener(new AnimatorListenerAdapter() { // from class: com.xiaomi.smarthome.screenshot.Screenshot.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                synchronized (Screenshot.LOCK) {
                    Screenshot.this.scrollListener.onSuccess();
                    Screenshot.LOCK.notify();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                Screenshot.this.scrollListener.onPreScroll();
            }
        });
        valueAnimatorOfInt.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void switchWebViewScrollBar(int i) {
        View view = this.view;
        if (view instanceof WebView) {
            WebView webView = (WebView) view;
            boolean zIsVerticalScrollBarEnabled = webView.isVerticalScrollBarEnabled();
            if (i == 400 && zIsVerticalScrollBarEnabled) {
                webView.setVerticalScrollBarEnabled(false);
            } else {
                webView.setVerticalScrollBarEnabled(true);
            }
        }
    }

    public void destroy() {
        Bitmap bitmap = this.tempBitmap;
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        this.tempBitmap = null;
        this.mThread.interrupt();
        LongScreenshotRunabable longScreenshotRunabable = this.runabable;
        if (longScreenshotRunabable != null) {
            longScreenshotRunabable.isDestory = true;
        }
        if (this.handler != null) {
            this.handler.removeCallbacksAndMessages(null);
        }
    }

    public void start() throws Throwable {
        String strCheckParams = checkParams();
        if (!TextUtils.isEmpty(strCheckParams)) {
            this.handler.sendFailMessage(1001, strCheckParams);
        } else if (this.isLongScreenshot) {
            preLongScreenshot();
        } else {
            screenshot();
        }
    }

    private Screenshot(Builder builder) {
        this.filePath = "";
        this.isLongScreenshot = false;
        this.scrollListener = new ScrollListener.Adapter() { // from class: com.xiaomi.smarthome.screenshot.Screenshot.1
            @Override // com.xiaomi.smarthome.screenshot.callback.ScrollListener
            public void onSuccess() {
                Screenshot screenshot = Screenshot.this;
                screenshot.tempBitmap = ScreenshotUtils.getScreenshot(screenshot.view);
            }
        };
        this.context = builder.context;
        this.view = builder.view;
        this.filePath = builder.filePath;
        this.isLongScreenshot = builder.isLongScreenshot;
        this.listener = builder.listener;
        this.handler = new ScreenshotHandler(this.context.getMainLooper());
    }
}
