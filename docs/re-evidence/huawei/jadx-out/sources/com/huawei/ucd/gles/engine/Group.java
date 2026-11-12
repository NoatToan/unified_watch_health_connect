package com.huawei.ucd.gles.engine;

import android.content.Context;
import defpackage.qid;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public abstract class Group extends Actor {
    private static final String TAG = "Group";
    protected List<Actor> mChildren;

    protected abstract void onChildAdded(Actor actor);

    public Group(Context context) {
        super(context);
        this.mChildren = new ArrayList();
    }

    public void addChild(Actor... actorArr) {
        synchronized (this) {
            for (Actor actor : actorArr) {
                if (actor != null) {
                    if (this.mChildren.contains(actor)) {
                        qid.e(TAG, "The actor is already in the group");
                    } else {
                        this.mChildren.add(actor);
                        onChildAdded(actor);
                        actor.setParent(this);
                        qid.e(TAG, qid.a() + "mContext=" + this.mContext);
                    }
                }
            }
        }
    }
}
