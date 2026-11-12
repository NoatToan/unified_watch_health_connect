package com.unionpay.tsmservice.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.unionpay.tsmservice.ITsmCallback;
import com.unionpay.tsmservice.OnSafetyKeyboardCallback;
import com.unionpay.tsmservice.UPTsmAddon;
import com.unionpay.tsmservice.data.NinePatchInfo;
import com.unionpay.tsmservice.request.GetEncryptDataRequestParams;
import com.unionpay.tsmservice.request.SafetyKeyboardRequestParams;
import com.unionpay.tsmservice.result.GetEncryptDataResult;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes18.dex */
public class UPNewSaftyKeyboard {
    private static final int S = -1;
    private static final int T = -1;
    private static final int U = 0;
    private static final int V = 1;
    private static final int W = 2;
    private static final int X = 0;
    private static final int Y = 1;
    private static final int Z = 2;
    private boolean A;
    private boolean B;
    private boolean C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private Typeface J;
    private boolean K;
    private OnShowListener L;
    private OnHideListener M;
    private OnEditorListener N;
    private OnSafetyKeyboardCallback.Stub O;
    private UPTsmAddon.UPTsmConnectionListener P;
    private Handler.Callback Q;
    private final Handler R;
    private Context a;
    private UPTsmAddon b;
    private int c;
    private int d;
    private String e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private boolean z;

    public interface OnEditorListener {
        void onEditorChanged(int i);
    }

    public interface OnHideListener {
        void onHide();
    }

    public interface OnShowListener {
        void onShow();
    }

    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                if (UPNewSaftyKeyboard.this.L != null) {
                    UPNewSaftyKeyboard.this.L.onShow();
                }
                return true;
            }
            if (i == 1) {
                if (UPNewSaftyKeyboard.this.M != null) {
                    UPNewSaftyKeyboard.this.M.onHide();
                }
                UPNewSaftyKeyboard.this.O = null;
                return true;
            }
            if (i != 2) {
                return false;
            }
            if (UPNewSaftyKeyboard.this.N != null) {
                UPNewSaftyKeyboard.this.d = message.arg1;
                UPNewSaftyKeyboard.this.N.onEditorChanged(UPNewSaftyKeyboard.this.d);
            }
            return true;
        }
    }

    public class b implements UPTsmAddon.UPTsmConnectionListener {
        public b() {
        }

        @Override // com.unionpay.tsmservice.UPTsmAddon.UPTsmConnectionListener
        public void onTsmConnected() {
            UPNewSaftyKeyboard uPNewSaftyKeyboard = UPNewSaftyKeyboard.this;
            uPNewSaftyKeyboard.m(uPNewSaftyKeyboard.c);
        }

        @Override // com.unionpay.tsmservice.UPTsmAddon.UPTsmConnectionListener
        public void onTsmDisconnected() {
        }
    }

    public class c extends OnSafetyKeyboardCallback.Stub {
        public c() {
        }

        @Override // com.unionpay.tsmservice.OnSafetyKeyboardCallback
        public void onEditorChanged(int i) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            messageObtain.arg1 = i;
            UPNewSaftyKeyboard.this.R.sendMessage(messageObtain);
        }

        @Override // com.unionpay.tsmservice.OnSafetyKeyboardCallback
        public void onHide() throws RemoteException {
            UPNewSaftyKeyboard.this.R.sendEmptyMessage(1);
        }

        @Override // com.unionpay.tsmservice.OnSafetyKeyboardCallback
        public void onShow() throws RemoteException {
            UPNewSaftyKeyboard.this.R.sendEmptyMessage(0);
        }
    }

    public class d extends FutureTask<String> {

        public class a implements Callable<String> {
            public final /* synthetic */ UPNewSaftyKeyboard a;

            public a(UPNewSaftyKeyboard uPNewSaftyKeyboard) {
                this.a = uPNewSaftyKeyboard;
            }

            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String call() throws Exception {
                throw new IllegalStateException("this should never be called");
            }
        }

        public class b extends ITsmCallback.Stub {
            public b() {
            }

            @Override // com.unionpay.tsmservice.ITsmCallback
            public void onError(String str, String str2) throws RemoteException {
                d.this.set("");
            }

            @Override // com.unionpay.tsmservice.ITsmCallback
            public void onResult(Bundle bundle) throws RemoteException {
                bundle.setClassLoader(GetEncryptDataResult.class.getClassLoader());
                d.this.set(((GetEncryptDataResult) bundle.get("result")).getData());
            }
        }

        public d() {
            super(new a(UPNewSaftyKeyboard.this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String e(long j, TimeUnit timeUnit) {
            try {
                try {
                    try {
                        try {
                            String str = get(j, timeUnit);
                            cancel(true);
                            return str;
                        } catch (TimeoutException e) {
                            e.printStackTrace();
                            cancel(true);
                            return "";
                        }
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                        cancel(true);
                        return "";
                    }
                } catch (ExecutionException e3) {
                    e3.printStackTrace();
                    cancel(true);
                    return "";
                }
            } catch (Throwable th) {
                cancel(true);
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(String str) {
            GetEncryptDataRequestParams getEncryptDataRequestParams = new GetEncryptDataRequestParams();
            getEncryptDataRequestParams.setPan(str);
            getEncryptDataRequestParams.setType(UPNewSaftyKeyboard.this.c);
            try {
                UPNewSaftyKeyboard.this.b.getEncryptData(getEncryptDataRequestParams, new b());
            } catch (RemoteException e) {
                e.printStackTrace();
                set("");
            }
        }
    }

    public UPNewSaftyKeyboard(Context context, int i) throws RemoteException {
        this(context, i, null);
    }

    private int k(Drawable drawable) {
        if (drawable == null) {
            return -1;
        }
        if (drawable instanceof BitmapDrawable) {
            return 0;
        }
        if (drawable instanceof ColorDrawable) {
            return 1;
        }
        return drawable instanceof NinePatchDrawable ? 2 : -1;
    }

    private int l(Drawable[] drawableArr) {
        if (drawableArr == null || drawableArr.length <= 0) {
            return -1;
        }
        for (Drawable drawable : drawableArr) {
            if (!(drawable instanceof BitmapDrawable)) {
                return -1;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(int i) {
        UPTsmAddon uPTsmAddon = this.b;
        if (uPTsmAddon != null) {
            try {
                uPTsmAddon.clearEncryptData(this.c);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    private Bitmap n(Drawable drawable) {
        return ((BitmapDrawable) drawable).getBitmap();
    }

    @SuppressLint({"NewApi"})
    private int o(Drawable drawable) {
        return ((ColorDrawable) drawable).getColor();
    }

    private ArrayList<Bitmap> p(Drawable[] drawableArr) {
        ArrayList<Bitmap> arrayList = new ArrayList<>();
        for (Drawable drawable : drawableArr) {
            if (n(drawable) != null) {
                arrayList.add(n(drawable));
            }
        }
        return arrayList;
    }

    private String q(String str) {
        d dVar = new d();
        dVar.f(str);
        return dVar.e(2000L, TimeUnit.MILLISECONDS);
    }

    private void r() throws RemoteException {
        UPTsmAddon uPTsmAddon = UPTsmAddon.getInstance(this.a);
        this.b = uPTsmAddon;
        if (uPTsmAddon.isConnected()) {
            m(this.c);
            return;
        }
        b bVar = new b();
        this.P = bVar;
        this.b.addConnectionListener(bVar);
        this.b.bind();
    }

    private NinePatchInfo s(Drawable drawable) {
        NinePatchDrawable ninePatchDrawable = (NinePatchDrawable) drawable;
        NinePatchInfo ninePatchInfo = new NinePatchInfo();
        Rect rect = new Rect();
        ninePatchDrawable.getPadding(rect);
        ninePatchInfo.setPadding(rect);
        Drawable.ConstantState constantState = ninePatchDrawable.getConstantState();
        try {
            Field declaredField = Class.forName("android.graphics.drawable.NinePatchDrawable$NinePatchState").getDeclaredField("mNinePatch");
            declaredField.setAccessible(true);
            Bitmap bitmap = (Bitmap) Class.forName("android.graphics.NinePatch").getDeclaredMethod("getBitmap", new Class[0]).invoke(declaredField.get(constantState), new Object[0]);
            ninePatchInfo.setBitmap(bitmap);
            ninePatchInfo.setChunk(bitmap.getNinePatchChunk());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ninePatchInfo;
    }

    private void t(Drawable drawable) throws RemoteException, KeyboardDrawableErrorException {
        int iK = k(drawable);
        if (iK == -1) {
            throw new KeyboardDrawableErrorException();
        }
        SafetyKeyboardRequestParams safetyKeyboardRequestParams = new SafetyKeyboardRequestParams();
        if (iK == 0) {
            safetyKeyboardRequestParams.setDelBgBitmap(n(drawable));
            safetyKeyboardRequestParams.setDelBgColor(-1);
        } else if (iK == 1) {
            safetyKeyboardRequestParams.setDelBgColor(o(drawable));
        } else if (iK == 2) {
            safetyKeyboardRequestParams.setDelKeyBgNinePatch(s(drawable));
        }
        x(safetyKeyboardRequestParams);
    }

    private void u(Drawable drawable) throws RemoteException, KeyboardDrawableErrorException {
        int iK = k(drawable);
        if (iK == -1) {
            throw new KeyboardDrawableErrorException();
        }
        SafetyKeyboardRequestParams safetyKeyboardRequestParams = new SafetyKeyboardRequestParams();
        if (iK == 0) {
            safetyKeyboardRequestParams.setDelForeBitmap(n(drawable));
        } else if (iK == 1) {
            throw new KeyboardDrawableErrorException();
        }
        x(safetyKeyboardRequestParams);
    }

    private void v(Drawable drawable) throws RemoteException, KeyboardDrawableErrorException {
        int iK = k(drawable);
        if (iK == -1) {
            throw new KeyboardDrawableErrorException();
        }
        SafetyKeyboardRequestParams safetyKeyboardRequestParams = new SafetyKeyboardRequestParams();
        if (iK == 0) {
            safetyKeyboardRequestParams.setDoneBgBitmap(n(drawable));
            safetyKeyboardRequestParams.setDoneBgColor(-1);
        } else if (iK == 1) {
            safetyKeyboardRequestParams.setDoneBgColor(o(drawable));
        } else if (iK == 2) {
            safetyKeyboardRequestParams.setDoneKeyBgNinePatch(s(drawable));
        }
        x(safetyKeyboardRequestParams);
    }

    private void w(Drawable drawable) throws RemoteException, KeyboardDrawableErrorException {
        int iK = k(drawable);
        if (iK == -1) {
            throw new KeyboardDrawableErrorException();
        }
        SafetyKeyboardRequestParams safetyKeyboardRequestParams = new SafetyKeyboardRequestParams();
        if (iK == 0) {
            safetyKeyboardRequestParams.setDoneForeBitmap(n(drawable));
        } else if (iK == 1) {
            throw new KeyboardDrawableErrorException();
        }
        x(safetyKeyboardRequestParams);
    }

    private void x(SafetyKeyboardRequestParams safetyKeyboardRequestParams) throws RemoteException {
        this.b.setSafetyKeyboardBitmap(safetyKeyboardRequestParams);
    }

    public synchronized boolean clearPwd() {
        int iClearEncryptData;
        this.d = 0;
        iClearEncryptData = -5;
        try {
            iClearEncryptData = this.b.clearEncryptData(this.c);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return iClearEncryptData == 0;
    }

    public void enableLightStatusBar(boolean z) {
        this.K = z;
    }

    public int getCurrentPinLength() {
        return this.d;
    }

    public String getInput() {
        return q("");
    }

    public boolean hide() {
        int iHideKeyboard;
        try {
            iHideKeyboard = this.b.hideKeyboard();
        } catch (RemoteException e) {
            e.printStackTrace();
            iHideKeyboard = -5;
        }
        return iHideKeyboard == 0;
    }

    public void setConfirmBtnOutPaddingRight(int i) {
        this.v = i;
    }

    public void setConfirmBtnSize(int i, int i2) {
        this.h = i;
        this.i = i2;
    }

    public void setDelKeyDrawable(Drawable drawable) throws RemoteException, KeyboardDrawableErrorException {
        if (drawable != null) {
            u(drawable);
        }
    }

    public void setDoneKeyDrawable(Drawable drawable) throws RemoteException, KeyboardDrawableErrorException {
        if (drawable != null) {
            w(drawable);
        }
    }

    public void setDoneKeyEnable(boolean z) {
        this.B = z;
    }

    public void setDoneKeyRightMode(boolean z) {
        this.A = z;
    }

    public void setKeyAreaPadding(int i, int i2, int i3, int i4) {
        this.q = i;
        this.r = i2;
        this.s = i3;
        this.t = i4;
    }

    public void setKeyBoardSize(int i, int i2) {
        this.f = i;
        this.g = i2;
    }

    public void setKeyboardAudio(boolean z) {
        this.z = z;
    }

    public void setKeyboardBackground(Drawable drawable) throws RemoteException, KeyboardDrawableErrorException {
        int iK = k(drawable);
        if (iK == -1) {
            throw new KeyboardDrawableErrorException();
        }
        SafetyKeyboardRequestParams safetyKeyboardRequestParams = new SafetyKeyboardRequestParams();
        if (iK == 0) {
            safetyKeyboardRequestParams.setKeyboardBgBitmap(n(drawable));
            safetyKeyboardRequestParams.setKeyboardBgColor(-1);
        } else if (iK == 1) {
            safetyKeyboardRequestParams.setKeyboardBgColor(o(drawable));
        } else if (iK == 2) {
            safetyKeyboardRequestParams.setKeyboardBgNinePatch(s(drawable));
        }
        x(safetyKeyboardRequestParams);
    }

    public void setKeyboardPadding(int i, int i2, int i3, int i4) {
        this.m = i;
        this.n = i2;
        this.o = i3;
        this.p = i4;
    }

    public void setKeyboardStartPosition(int i, int i2) {
        this.w = i;
        this.x = i2;
        this.y = 0;
    }

    public void setKeyboardVibrate(boolean z) {
        this.C = z;
    }

    public void setNumKeyBackgroud(Drawable drawable) throws RemoteException, KeyboardDrawableErrorException {
        int iK = k(drawable);
        if (iK == -1) {
            throw new KeyboardDrawableErrorException();
        }
        SafetyKeyboardRequestParams safetyKeyboardRequestParams = new SafetyKeyboardRequestParams();
        if (iK == 0) {
            safetyKeyboardRequestParams.setNumBgBitmap(n(drawable));
            safetyKeyboardRequestParams.setNumBgColor(-1);
        } else if (iK == 1) {
            safetyKeyboardRequestParams.setNumBgColor(o(drawable));
        } else if (iK == 2) {
            safetyKeyboardRequestParams.setNumKeyBgNinePatch(s(drawable));
        }
        x(safetyKeyboardRequestParams);
    }

    public void setNumKeyMargin(int i, int i2) {
        this.k = i;
        this.l = i2;
    }

    public void setNumberKeyColor(int i) {
        this.I = i;
    }

    public void setNumberKeyDrawable(Drawable[] drawableArr) throws RemoteException, KeyboardDrawableErrorException {
        if (l(drawableArr) != 0) {
            throw new KeyboardDrawableErrorException();
        }
        SafetyKeyboardRequestParams safetyKeyboardRequestParams = new SafetyKeyboardRequestParams();
        safetyKeyboardRequestParams.setNumForeBitmaps(p(drawableArr));
        x(safetyKeyboardRequestParams);
    }

    public void setNumberKeySize(int i) {
        this.u = i;
    }

    public void setOnEditorListener(OnEditorListener onEditorListener) {
        this.N = onEditorListener;
    }

    public void setOnHideListener(OnHideListener onHideListener) {
        this.M = onHideListener;
    }

    public void setOnShowListener(OnShowListener onShowListener) {
        this.L = onShowListener;
    }

    public void setTitleBackground(Drawable drawable) throws RemoteException, KeyboardDrawableErrorException {
        int iK = k(drawable);
        if (iK == -1) {
            throw new KeyboardDrawableErrorException();
        }
        SafetyKeyboardRequestParams safetyKeyboardRequestParams = new SafetyKeyboardRequestParams();
        if (iK == 0) {
            safetyKeyboardRequestParams.setTitleBgBitmap(n(drawable));
            safetyKeyboardRequestParams.setTitleBgColor(-1);
        } else if (iK == 1) {
            safetyKeyboardRequestParams.setTitleBgColor(o(drawable));
        } else if (iK == 2) {
            safetyKeyboardRequestParams.setTitleBgNinePatch(s(drawable));
        }
        x(safetyKeyboardRequestParams);
    }

    public void setTitleColor(int i) {
        this.G = i;
    }

    public void setTitleConfirmDrawable(Drawable drawable) throws RemoteException, KeyboardDrawableErrorException {
        int iK = k(drawable);
        if (iK == -1) {
            throw new KeyboardDrawableErrorException();
        }
        SafetyKeyboardRequestParams safetyKeyboardRequestParams = new SafetyKeyboardRequestParams();
        if (iK == 0) {
            safetyKeyboardRequestParams.setTitleDropBitmap(n(drawable));
        } else if (iK == 1) {
            throw new KeyboardDrawableErrorException();
        }
        x(safetyKeyboardRequestParams);
    }

    public void setTitleDrawable(Drawable drawable) throws RemoteException, KeyboardDrawableErrorException {
        int iK = k(drawable);
        if (iK == -1) {
            throw new KeyboardDrawableErrorException();
        }
        SafetyKeyboardRequestParams safetyKeyboardRequestParams = new SafetyKeyboardRequestParams();
        if (iK == 0) {
            safetyKeyboardRequestParams.setTitleIconBitmap(n(drawable));
        } else if (iK == 1) {
            throw new KeyboardDrawableErrorException();
        }
        x(safetyKeyboardRequestParams);
    }

    public void setTitleDrawablePadding(int i) {
        this.F = i;
    }

    public void setTitleDrawableSize(int i, int i2) {
        this.D = i;
        this.E = i2;
    }

    public void setTitleFont(Typeface typeface) {
        this.J = typeface;
    }

    public void setTitleHeight(int i) {
        this.j = i;
    }

    public void setTitleSize(int i) {
        this.H = i;
    }

    public void setTitleText(String str) {
        this.e = str;
    }

    public synchronized boolean show() {
        if (this.O != null) {
            return false;
        }
        this.O = new c();
        try {
            SafetyKeyboardRequestParams safetyKeyboardRequestParams = new SafetyKeyboardRequestParams();
            safetyKeyboardRequestParams.setTitle(this.e);
            safetyKeyboardRequestParams.setKeyboardWidth(this.f);
            safetyKeyboardRequestParams.setKeyboardHeight(this.g);
            safetyKeyboardRequestParams.setConfirmBtnWidth(this.h);
            safetyKeyboardRequestParams.setConfirmBtnHeight(this.i);
            safetyKeyboardRequestParams.setTitleHeight(this.j);
            safetyKeyboardRequestParams.setMarginRow(this.k);
            safetyKeyboardRequestParams.setMarginCol(this.l);
            safetyKeyboardRequestParams.setOutPaddingLeft(this.m);
            safetyKeyboardRequestParams.setOutPaddingRight(this.o);
            safetyKeyboardRequestParams.setOutPaddingTop(this.n);
            safetyKeyboardRequestParams.setOutPaddingBottom(this.p);
            safetyKeyboardRequestParams.setInnerPaddingLeft(this.q);
            safetyKeyboardRequestParams.setInnerPaddingRight(this.s);
            safetyKeyboardRequestParams.setInnerPaddingTop(this.r);
            safetyKeyboardRequestParams.setInnerPaddingBottom(this.t);
            safetyKeyboardRequestParams.setNumSize(this.u);
            safetyKeyboardRequestParams.setConfirmBtnOutPaddingRight(this.v);
            safetyKeyboardRequestParams.setStartX(this.w);
            safetyKeyboardRequestParams.setStartY(this.x);
            safetyKeyboardRequestParams.setDefaultPosition(this.y);
            safetyKeyboardRequestParams.setIsAudio(this.z ? 1 : 0);
            safetyKeyboardRequestParams.setDoneRight(this.A ? 1 : 0);
            safetyKeyboardRequestParams.setEnableOKBtn(this.B ? 1 : 0);
            safetyKeyboardRequestParams.setIsVibrate(this.C ? 1 : 0);
            safetyKeyboardRequestParams.setSecureWidth(this.D);
            safetyKeyboardRequestParams.setSecureHeight(this.E);
            safetyKeyboardRequestParams.setTitleDrawablePadding(this.F);
            safetyKeyboardRequestParams.setTitleColor(this.G);
            safetyKeyboardRequestParams.setTitleSize(this.H);
            safetyKeyboardRequestParams.setNumberKeyColor(this.I);
            Typeface typeface = this.J;
            if (typeface != null) {
                safetyKeyboardRequestParams.setTitleFont(typeface.getStyle());
            }
            safetyKeyboardRequestParams.setEnableLightStatusBar(this.K);
            if (this.b.showSafetyKeyboard(safetyKeyboardRequestParams, this.c, this.O, this.a) == 0) {
                return true;
            }
            this.O = null;
            return false;
        } catch (RemoteException e) {
            e.printStackTrace();
            this.O = null;
            return false;
        }
    }

    public UPNewSaftyKeyboard(Context context, int i, Drawable drawable) throws RemoteException {
        this.a = null;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.y = 1;
        this.z = false;
        this.A = false;
        this.B = true;
        this.C = false;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -16777216;
        this.K = false;
        this.Q = new a();
        this.R = new Handler(Looper.getMainLooper(), this.Q);
        this.a = context;
        this.c = i;
        if (i < 2000 || i > 2001) {
            throw new IllegalArgumentException("Type is error");
        }
        r();
        if (drawable != null) {
            try {
                setKeyboardBackground(drawable);
            } catch (KeyboardDrawableErrorException e) {
                e.printStackTrace();
            }
        }
    }

    public String getInput(String str) {
        return this.c != 2000 ? "" : q(str);
    }

    public void setDelKeyDrawable(Drawable drawable, Drawable drawable2) throws RemoteException, KeyboardDrawableErrorException {
        if (drawable != null) {
            u(drawable);
        }
        if (drawable2 != null) {
            t(drawable2);
        }
    }

    public void setDoneKeyDrawable(Drawable drawable, Drawable drawable2) throws RemoteException, KeyboardDrawableErrorException {
        if (drawable != null) {
            w(drawable);
        }
        if (drawable2 != null) {
            v(drawable2);
        }
    }
}
