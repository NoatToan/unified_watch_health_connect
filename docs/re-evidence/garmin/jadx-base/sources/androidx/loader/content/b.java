package androidx.loader.content;

import am.j;
import android.content.Context;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import org.apache.commons.text.StringSubstitutor;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public class b<D> {
    Context mContext;
    int mId;
    InterfaceC0115b<D> mListener;
    a<D> mOnLoadCanceledListener;
    boolean mStarted = false;
    boolean mAbandoned = false;
    boolean mReset = true;
    boolean mContentChanged = false;
    boolean mProcessingChange = false;

    public interface a<D> {
    }

    /* JADX INFO: renamed from: androidx.loader.content.b$b, reason: collision with other inner class name */
    public interface InterfaceC0115b<D> {
    }

    public b(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public void abandon() {
        this.mAbandoned = true;
        onAbandon();
    }

    public boolean cancelLoad() {
        return onCancelLoad();
    }

    public void commitContentChanged() {
        this.mProcessingChange = false;
    }

    public String dataToString(D d14) {
        StringBuilder sb3 = new StringBuilder(64);
        k7.c.a(sb3, d14);
        sb3.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb3.toString();
    }

    public void deliverCancellation() {
    }

    public void deliverResult(D d14) {
        InterfaceC0115b<D> interfaceC0115b = this.mListener;
        if (interfaceC0115b != null) {
            y9.b.a aVar = (y9.b.a) interfaceC0115b;
            aVar.getClass();
            if (Looper.myLooper() == Looper.getMainLooper()) {
                aVar.m(d14);
            } else {
                aVar.j(d14);
            }
        }
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.mId);
        printWriter.print(" mListener=");
        printWriter.println(this.mListener);
        if (this.mStarted || this.mContentChanged || this.mProcessingChange) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.mStarted);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.mContentChanged);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.mProcessingChange);
        }
        if (this.mAbandoned || this.mReset) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.mAbandoned);
            printWriter.print(" mReset=");
            printWriter.println(this.mReset);
        }
    }

    public void forceLoad() {
        onForceLoad();
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getId() {
        return this.mId;
    }

    public boolean isAbandoned() {
        return this.mAbandoned;
    }

    public boolean isReset() {
        return this.mReset;
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    public void onAbandon() {
    }

    public boolean onCancelLoad() {
        return false;
    }

    public void onContentChanged() {
        if (this.mStarted) {
            forceLoad();
        } else {
            this.mContentChanged = true;
        }
    }

    public void onForceLoad() {
    }

    public void onReset() {
    }

    public void onStartLoading() {
    }

    public void onStopLoading() {
    }

    public void registerListener(int i14, InterfaceC0115b<D> interfaceC0115b) {
        if (this.mListener != null) {
            h.z("There is already a listener registered");
        } else {
            this.mListener = interfaceC0115b;
            this.mId = i14;
        }
    }

    public void registerOnLoadCanceledListener(a<D> aVar) {
    }

    public void reset() {
        onReset();
        this.mReset = true;
        this.mStarted = false;
        this.mAbandoned = false;
        this.mContentChanged = false;
        this.mProcessingChange = false;
    }

    public void rollbackContentChanged() {
        if (this.mProcessingChange) {
            onContentChanged();
        }
    }

    public final void startLoading() {
        this.mStarted = true;
        this.mReset = false;
        this.mAbandoned = false;
        onStartLoading();
    }

    public void stopLoading() {
        this.mStarted = false;
        onStopLoading();
    }

    public boolean takeContentChanged() {
        boolean z14 = this.mContentChanged;
        this.mContentChanged = false;
        this.mProcessingChange |= z14;
        return z14;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder(64);
        k7.c.a(sb3, this);
        sb3.append(" id=");
        return j.q(sb3, this.mId, StringSubstitutor.DEFAULT_VAR_END);
    }

    public void unregisterListener(InterfaceC0115b<D> interfaceC0115b) {
        InterfaceC0115b<D> interfaceC0115b2 = this.mListener;
        if (interfaceC0115b2 == null) {
            h.z("No listener register");
        } else if (interfaceC0115b2 == interfaceC0115b) {
            this.mListener = null;
        } else {
            h.s("Attempting to unregister the wrong listener");
        }
    }

    public void unregisterOnLoadCanceledListener(a<D> aVar) {
        throw new IllegalStateException("No listener register");
    }
}
