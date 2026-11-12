package aurelienribon.tweenengine;

import aurelienribon.tweenengine.paths.CatmullRom;
import aurelienribon.tweenengine.paths.Linear;

/* JADX INFO: loaded from: classes2.dex */
public interface TweenPaths {
    public static final Linear linear = new Linear();
    public static final CatmullRom catmullRom = new CatmullRom();
}
