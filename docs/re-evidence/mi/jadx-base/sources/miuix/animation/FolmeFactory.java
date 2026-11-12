package miuix.animation;

import miuix.animation.base.AnimConfigLink;
import miuix.animation.controller.AnimState;
import miuix.animation.internal.AndroidEngine;
import miuix.animation.internal.FolmeEngine;
import miuix.animation.internal.TargetHandler;

/* JADX INFO: loaded from: classes3.dex */
public class FolmeFactory {
    public static void clean(final IAnimTarget iAnimTarget) {
        Runnable runnable = new Runnable() { // from class: miuix.animation.FolmeFactory.1
            @Override // java.lang.Runnable
            public void run() {
                FolmeEngine engine = FolmeFactory.getEngine();
                if (engine == null) {
                    return;
                }
                if (iAnimTarget.hasFlags(1L)) {
                    engine.removeFromOneShot(iAnimTarget);
                }
                iAnimTarget.clean();
            }
        };
        TargetHandler handler = iAnimTarget.getHandler();
        if (handler == null || handler.isInTargetThread()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static void end() {
        AndroidEngine.getInst().end();
    }

    public static void fromToState(IAnimTarget iAnimTarget, AnimState animState, AnimState animState2, AnimConfigLink animConfigLink) {
        FolmeEngine engine = getEngine();
        if (engine == null) {
            return;
        }
        engine.fromTo(iAnimTarget, animState, animState2, animConfigLink);
    }

    public static FolmeEngine getEngine() {
        return AndroidEngine.getInst();
    }

    public static void start() {
        AndroidEngine.getInst().start();
    }
}
