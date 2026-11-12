package com.huawei.dynamicanimation;

import android.util.Log;
import android.util.SparseArray;
import android.view.Choreographer;
import com.huawei.dynamicanimation.DynamicAnimation;
import com.huawei.dynamicanimation.PhysicalChain;
import defpackage.crc;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes23.dex */
public abstract class PhysicalChain<K extends PhysicalChain, T extends DynamicAnimation> implements DynamicAnimation.OnAnimationUpdateListener, DynamicAnimation.OnAnimationStartListener {
    private static final int DEFAULT_CHAIN_SIZE = 16;
    private static final int INVALID_INDEX = -1;
    private static final int SIZE_MULTIPLE = 2;
    private static final String TAG = "PhysicalChain";
    private crc<T> mAnimationObjPools;
    private crc<PhysicalChain<K, T>.e> mCallbackPools;
    protected int mMaxChainSize;
    protected SparseArray<T> mModelList = new SparseArray<>();
    protected int mControlModelIndex = Integer.MIN_VALUE;
    protected AtomicBoolean mIsDirty = new AtomicBoolean(true);
    private boolean mIsDelayed = true;
    private long mDelay = 0;

    abstract T createAnimationObj();

    protected abstract void onChainTransfer(T t, float f, float f2, int i);

    protected void reConfig() {
    }

    abstract void reConfig(T t, int i);

    abstract T reUseAnimationObj(T t);

    abstract T resetAnimationObj(T t);

    public PhysicalChain(int i) {
        this.mMaxChainSize = i;
        this.mCallbackPools = new crc<>(i * 2);
        this.mAnimationObjPools = new crc<>(i);
    }

    public K addObject(ChainListener chainListener) {
        Log.d(TAG, "addObject: listener=" + chainListener);
        return (K) addObject(-1, chainListener);
    }

    public K addObject(int i, ChainListener chainListener) {
        if (this.mModelList.size() > this.mMaxChainSize - 1) {
            Log.i(TAG, "addObject: remove first");
            T tValueAt = this.mModelList.valueAt(0);
            this.mModelList.removeAt(0);
            resetAnimationObj(tValueAt);
            this.mAnimationObjPools.restoreInstance(tValueAt);
        }
        T crcVar = this.mAnimationObjPools.getInstance();
        if (crcVar == null) {
            crcVar = createAnimationObj();
        } else {
            reUseAnimationObj(crcVar);
        }
        crcVar.addUpdateListener(chainListener).addUpdateListener(this);
        if (i < 0) {
            i = this.mModelList.size();
        }
        this.mModelList.append(i, (T) crcVar);
        reConfig(crcVar, Math.abs(this.mModelList.indexOfKey(i) - this.mModelList.indexOfKey(this.mControlModelIndex)));
        return this;
    }

    public PhysicalChain removeObject(int i) {
        if (!isIndexValid(i)) {
            return this;
        }
        int iIndexOfKey = this.mModelList.indexOfKey(i);
        T tValueAt = this.mModelList.valueAt(iIndexOfKey);
        this.mModelList.removeAt(iIndexOfKey);
        this.mAnimationObjPools.restoreInstance(tValueAt);
        return this;
    }

    public void reParamsTransfer() {
        reConfig(this.mModelList.get(this.mControlModelIndex), 0);
        int iIndexOfKey = this.mModelList.indexOfKey(this.mControlModelIndex);
        int size = this.mModelList.size();
        int i = iIndexOfKey;
        while (true) {
            i++;
            if (i >= size) {
                break;
            } else {
                reConfig(this.mModelList.valueAt(i), i - iIndexOfKey);
            }
        }
        int i2 = iIndexOfKey;
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            } else {
                reConfig(this.mModelList.valueAt(i2), iIndexOfKey - i2);
            }
        }
    }

    @Override // com.huawei.dynamicanimation.DynamicAnimation.OnAnimationStartListener
    public void onAnimationStart(DynamicAnimation dynamicAnimation, float f, float f2) {
        if (this.mModelList.size() > 0 && this.mIsDirty.compareAndSet(true, false)) {
            reParamsTransfer();
        }
    }

    @Override // com.huawei.dynamicanimation.DynamicAnimation.OnAnimationUpdateListener
    public void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
        int i;
        int i2;
        int iIndexOfValue = this.mModelList.indexOfValue(dynamicAnimation);
        int iIndexOfKey = this.mModelList.indexOfKey(this.mControlModelIndex);
        if (iIndexOfValue == iIndexOfKey) {
            i2 = iIndexOfValue - 1;
            i = iIndexOfValue + 1;
        } else if (iIndexOfValue < iIndexOfKey) {
            i2 = iIndexOfValue - 1;
            i = -1;
        } else {
            i = iIndexOfValue + 1;
            i2 = -1;
        }
        if (i > -1 && i < this.mModelList.size()) {
            onTransfer(this.mModelList.valueAt(i), f, f2, i);
        }
        if (i2 <= -1 || i2 >= this.mModelList.size()) {
            return;
        }
        onTransfer(this.mModelList.valueAt(i2), f, f2, i2);
    }

    public void cancel() {
        if (isIndexValid(getControlModelIndex())) {
            getModelList().valueAt(getControlModelIndex()).cancel();
        }
    }

    public void cancelAll() {
        for (int i = 0; i < this.mModelList.size(); i++) {
            T tValueAt = this.mModelList.valueAt(i);
            tValueAt.cancel();
            tValueAt.setMinValue(-3.4028235E38f);
            tValueAt.setMaxValue(Float.MAX_VALUE);
            tValueAt.setStartVelocity(0.0f);
        }
        PhysicalChain<K, T>.e crcVar = this.mCallbackPools.getInstance();
        while (crcVar != null) {
            Choreographer.getInstance().removeFrameCallback(crcVar);
            crcVar = this.mCallbackPools.getInstance();
        }
    }

    private void onTransfer(T t, float f, float f2, int i) {
        if (!this.mIsDelayed) {
            onChainTransfer(t, f, f2, i);
            return;
        }
        PhysicalChain<K, T>.e crcVar = this.mCallbackPools.getInstance();
        if (crcVar == null) {
            crcVar = new e();
        }
        if (this.mDelay <= 0) {
            Choreographer.getInstance().postFrameCallback(crcVar.b(t).c(f).b(f2).e(i));
        } else {
            Choreographer.getInstance().postFrameCallbackDelayed(crcVar.b(t).c(f).b(f2).e(i), this.mDelay);
        }
    }

    class e implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f5490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f5491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private T f5492c;
        private int e;

        e() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            PhysicalChain.this.onChainTransfer(this.f5492c, this.f5490a, this.f5491b, this.e);
            PhysicalChain.this.mCallbackPools.restoreInstance(this);
        }

        public PhysicalChain<K, T>.e b(T t) {
            this.f5492c = t;
            return this;
        }

        public PhysicalChain<K, T>.e c(float f) {
            this.f5490a = f;
            return this;
        }

        public PhysicalChain<K, T>.e b(float f) {
            this.f5491b = f;
            return this;
        }

        public PhysicalChain<K, T>.e e(int i) {
            this.e = i;
            return this;
        }
    }

    public SparseArray<T> getModelList() {
        return this.mModelList;
    }

    public int getControlModelIndex() {
        return this.mControlModelIndex;
    }

    protected ParamTransfer diffMember(ParamTransfer paramTransfer, ParamTransfer paramTransfer2) {
        if (paramTransfer == paramTransfer2 || (paramTransfer != null && paramTransfer.equals(paramTransfer2))) {
            return paramTransfer;
        }
        this.mIsDirty.compareAndSet(false, true);
        return paramTransfer2;
    }

    protected float diffMember(float f, float f2) {
        if (Float.compare(f, f2) == 0) {
            return f;
        }
        this.mIsDirty.compareAndSet(false, true);
        return f2;
    }

    public K setControlModelIndex(int i) {
        int i2;
        if (!isIndexValid(i) || (i2 = this.mControlModelIndex) == i) {
            return this;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.mModelList.get(i2).removeStartListener(this);
        }
        this.mControlModelIndex = i;
        this.mModelList.get(i).addStartListener(this);
        this.mIsDirty.set(true);
        return this;
    }

    private boolean isIndexValid(int i) {
        return this.mModelList.indexOfKey(i) >= 0;
    }

    public int getChainSize() {
        return this.mMaxChainSize;
    }

    public K setChainSize(int i) {
        this.mMaxChainSize = i;
        return this;
    }

    public boolean isDelayed() {
        return this.mIsDelayed;
    }

    public K setDelayed(boolean z) {
        this.mIsDelayed = z;
        return this;
    }

    public long getDelay() {
        return this.mDelay;
    }

    public K setDelay(long j) {
        this.mDelay = j;
        return this;
    }
}
