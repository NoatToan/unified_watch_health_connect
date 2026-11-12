package defpackage;

import com.huawei.animation.physical2.SimpleSpringNode;
import com.huawei.animation.physical2.SpringAdapter;
import com.huawei.animation.physical2.SpringNode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class bdh extends SpringAdapter<SpringNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1039b = 0;
    private List<SpringNode> e = new ArrayList();

    public void c(SpringNode springNode) {
        this.e.add(springNode);
        notifyNodeAdd(springNode);
    }

    @Override // com.huawei.animation.physical2.SpringAdapter
    public SpringNode getNext(SpringNode springNode) {
        if (springNode == null) {
            return null;
        }
        return getNode(springNode.getIndex() + 1);
    }

    @Override // com.huawei.animation.physical2.SpringAdapter
    public SpringNode getPrev(SpringNode springNode) {
        if (springNode == null) {
            return null;
        }
        return getNode(springNode.getIndex() - 1);
    }

    @Override // com.huawei.animation.physical2.SpringAdapter
    public int getSize() {
        return this.e.size();
    }

    @Override // com.huawei.animation.physical2.SpringAdapter
    public SpringNode getControlNode() {
        return getNode(a());
    }

    @Override // com.huawei.animation.physical2.SpringAdapter
    public SpringNode getNode(int i) {
        if (c(i)) {
            return this.e.get(i);
        }
        return null;
    }

    public int a() {
        return this.f1039b;
    }

    public void b(int i) {
        if (c(i)) {
            this.f1039b = i;
        }
    }

    public boolean c(int i) {
        return i < this.e.size() && i >= 0;
    }

    public void e(int i) {
        if (i < 0) {
            for (int size = this.e.size() - 1; size >= 0; size--) {
                int i2 = size + i;
                SpringNode springNode = i2 < 0 ? this.e.get(0) : this.e.get(i2);
                SpringNode springNode2 = this.e.get(size);
                if (!(springNode instanceof SimpleSpringNode) || !(springNode2 instanceof SimpleSpringNode)) {
                    return;
                }
                b(springNode2, springNode);
            }
            return;
        }
        d(i);
    }

    private void d(int i) {
        SpringNode springNode;
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            int i3 = i2 + i;
            if (i3 >= this.e.size()) {
                List<SpringNode> list = this.e;
                springNode = list.get(list.size() - 1);
            } else {
                springNode = this.e.get(i3);
            }
            SpringNode springNode2 = springNode;
            SpringNode springNode3 = this.e.get(i2);
            if (!(springNode2 instanceof SimpleSpringNode) || !(springNode3 instanceof SimpleSpringNode)) {
                return;
            }
            b(springNode3, springNode2);
        }
    }

    private void b(SpringNode springNode, SpringNode springNode2) {
        SimpleSpringNode simpleSpringNode = (SimpleSpringNode) springNode;
        SimpleSpringNode simpleSpringNode2 = (SimpleSpringNode) springNode2;
        if (springNode.getIndex() == a()) {
            simpleSpringNode.resetNode(simpleSpringNode2.getValue(), 0.0f);
        } else {
            simpleSpringNode.resetNode(simpleSpringNode2.getValue(), simpleSpringNode2.getVelocity());
        }
    }
}
