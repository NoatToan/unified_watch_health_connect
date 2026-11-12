package com.huawei.animation.physical2;

import android.util.Log;
import android.view.Choreographer;
import defpackage.bdg;
import defpackage.bdh;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes23.dex */
public class SimpleSpringChain implements SpringAdapter.AdapterObserve, Choreographer.FrameCallback {
    private SpringAdapter f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected List<Listener> f5146c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f5144a = 228.0f;
    private float d = 30.0f;
    private ParamTransfer<Float> h = new bdg(1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ParamTransfer<Float> f5145b = new bdg();
    private float e = 1.0f;
    private int j = -1;
    private int g = -1;
    private boolean i = false;

    public interface Listener {
        void onSpringChainEnd();

        void onSpringChainStart();

        void onSpringChainUpdate();
    }

    public static abstract class ListenerAdapter implements Listener {
        @Override // com.huawei.animation.physical2.SimpleSpringChain.Listener
        public void onSpringChainEnd() {
        }

        @Override // com.huawei.animation.physical2.SimpleSpringChain.Listener
        public void onSpringChainStart() {
        }

        @Override // com.huawei.animation.physical2.SimpleSpringChain.Listener
        public void onSpringChainUpdate() {
        }
    }

    public SimpleSpringChain(SpringAdapter springAdapter) {
        if (springAdapter == null) {
            throw new IllegalArgumentException("springAdapter can not be null");
        }
        this.f = springAdapter;
        springAdapter.setObserve(this);
        g();
    }

    @Override // com.huawei.animation.physical2.SpringAdapter.AdapterObserve
    public void onControlNodeChange() {
        g();
    }

    @Override // com.huawei.animation.physical2.SpringAdapter.AdapterObserve
    public void onNodeAdd(SpringNode springNode) {
        if (springNode == null) {
            return;
        }
        a(springNode);
    }

    @Override // com.huawei.animation.physical2.SpringAdapter.AdapterObserve
    public void onNodesDelete(SpringNode springNode, int i) {
        if (springNode == null) {
            return;
        }
        SpringNode next = this.f.getNext(springNode);
        while (next != null) {
            next.setIndex(next.getIndex() - i);
            a(next);
            next = this.f.getNext(next);
        }
    }

    private void g() {
        if (this.f.getControlNode() instanceof SimpleSpringNodeEx) {
            SpringAdapter springAdapter = this.f;
            if (springAdapter instanceof bdh) {
                ((bdh) springAdapter).b(springAdapter.getSize() / 2);
            }
        }
        for (int i = 0; i < this.f.getSize(); i++) {
            SpringNode node = this.f.getNode(i);
            if (node != null) {
                a(node);
            }
        }
    }

    private void a(SpringNode springNode) {
        int i;
        int index = springNode.getIndex();
        SpringNode controlNode = this.f.getControlNode();
        if (controlNode == null) {
            controlNode = springNode;
        }
        int iAbs = Math.abs(index - controlNode.getIndex());
        springNode.transferParams(this.h.transfer(Float.valueOf(this.f5144a), iAbs).floatValue(), this.f5145b.transfer(Float.valueOf(this.d), iAbs).floatValue());
        springNode.setFrameDelta(this.e);
        int i2 = this.j;
        if (i2 != -1 && (i = this.g) != -1) {
            springNode.setDistanceDelta(i2, i);
        }
        if (springNode.getAdapter() == null) {
            springNode.setAdapter(this.f);
        }
    }

    public SimpleSpringChain c(float f) {
        SpringNode controlNode = this.f.getControlNode();
        if (controlNode != null) {
            controlNode.setValue(f);
        }
        j();
        return this;
    }

    public SimpleSpringChain c() {
        for (int i = 0; i < this.f.getSize(); i++) {
            this.f.getNode(i).cancel();
        }
        this.i = false;
        return this;
    }

    public SimpleSpringChain b() {
        g();
        return this;
    }

    public SpringNode d() {
        return this.f.getControlNode();
    }

    public SimpleSpringChain b(float f) {
        this.f5144a = f;
        return this;
    }

    public SimpleSpringChain e(float f) {
        this.d = f;
        return this;
    }

    public SimpleSpringChain a(ParamTransfer<Float> paramTransfer) {
        this.h = paramTransfer;
        return this;
    }

    public SimpleSpringChain d(ParamTransfer<Float> paramTransfer) {
        this.f5145b = paramTransfer;
        return this;
    }

    public SimpleSpringChain d(float f) {
        this.e = f;
        return this;
    }

    public SimpleSpringChain a(int i, int i2) {
        if (i < 0 || i2 < 0 || i2 < i) {
            Log.w("SimpleSpringChain", "setDistanceDelta: distance delta should be greater than zero.");
            return this;
        }
        this.j = i;
        this.g = i2;
        return this;
    }

    public boolean e() {
        return this.i;
    }

    private void j() {
        if (this.i) {
            return;
        }
        Choreographer.getInstance().postFrameCallback(this);
        this.i = true;
        for (Listener listener : this.f5146c) {
            if (listener != null) {
                listener.onSpringChainStart();
            }
        }
    }

    private void a() {
        this.i = false;
        Choreographer.getInstance().removeFrameCallback(this);
        for (Listener listener : this.f5146c) {
            if (listener != null) {
                listener.onSpringChainEnd();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        ?? r5;
        boolean zIsDoFrame;
        ?? r6;
        if (this.i) {
            SpringNode controlNode = this.f.getControlNode();
            int i = 1;
            if ((controlNode instanceof SimpleSpringNodeEx) && (this.f instanceof bdh)) {
                zIsDoFrame = controlNode.isDoFrame();
                bdh bdhVar = (bdh) this.f;
                int iA = bdhVar.a();
                while (i <= iA) {
                    int i2 = iA + i;
                    if (bdhVar.c(i2)) {
                        r5 = zIsDoFrame;
                        r6 = r5;
                        r6 = (r5 == true ? 1 : 0) & (this.f.getNode(i2).isDoFrame() ? 1 : 0);
                    }
                    r5 = zIsDoFrame;
                    r6 = r5;
                    int i3 = iA - i;
                    if (bdhVar.c(i3)) {
                        r6 = (r6 == true ? 1 : 0) & (this.f.getNode(i3).isDoFrame() ? 1 : 0);
                    }
                    i++;
                    r5 = r6;
                }
            } else {
                while (controlNode != null) {
                    i &= controlNode.isDoFrame() ? 1 : 0;
                    controlNode = this.f.getNext(controlNode);
                }
                r5 = i;
            }
            if (r5 != 0) {
                r5 = zIsDoFrame;
                a();
            } else {
                r5 = zIsDoFrame;
                Choreographer.getInstance().postFrameCallback(this);
            }
        }
    }

    public void b(int i) {
        SpringAdapter springAdapter = this.f;
        if (springAdapter instanceof bdh) {
            ((bdh) springAdapter).e(i);
        }
    }
}
