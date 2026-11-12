package androidx.constraintlayout.compose;

import androidx.compose.runtime.MutableState;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.Registry;
import androidx.constraintlayout.core.state.RegistryCallback;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlin.PublishedApi;
import org.intellij.lang.annotations.Language;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001b\b!\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b4\u00105J\b\u0010\u0003\u001a\u00020\u0002H\u0004J\u0014\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\b\u0010\b\u001a\u00020\u0002H\u0004J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\tJ\b\u0010\u000f\u001a\u0004\u0018\u00010\tJ\u0006\u0010\u0011\u001a\u00020\u0010J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\tH\u0016J\u0006\u0010\u0017\u001a\u00020\tJ\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014J\u0010\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0014J\u0016\u0010 \u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012J\u0010\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0012H\u0004J\u0010\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0012H\u0004R\u0016\u0010%\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&R\u0016\u0010(\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010/R\u0016\u00103\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010/¨\u00066"}, d2 = {"Landroidx/constraintlayout/compose/EditableJSONLayout;", "Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "", "initialization", "Landroidx/compose/runtime/MutableState;", "", "needsUpdate", "setUpdateFlag", "signalUpdate", "", "content", "setCurrentContent", "getCurrentContent", "name", "setDebugName", "getDebugName", "Landroidx/constraintlayout/compose/MotionLayoutDebugFlags;", "getForcedDrawDebug", "", "getForcedWidth", "getForcedHeight", "information", "setLayoutInformation", "getLayoutInformation", "Landroidx/constraintlayout/compose/LayoutInfoFlags;", "getLayoutInformationMode", "onNewContent", "", "progress", "onNewProgress", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "height", "onNewDimensions", "mode", "onLayoutInformation", Constant.METHOD_DEBUG_MODE, "onDrawDebug", "forcedWidth", LogUtil.I, "forcedHeight", "forcedDrawDebug", "Landroidx/constraintlayout/compose/MotionLayoutDebugFlags;", "updateFlag", "Landroidx/compose/runtime/MutableState;", "layoutInformationMode", "Landroidx/constraintlayout/compose/LayoutInfoFlags;", "layoutInformation", "Ljava/lang/String;", "last", "J", "debugName", "currentContent", "<init>", "(Ljava/lang/String;)V", "compose_release"}, k = 1, mv = {1, 5, 1})
@PublishedApi
public abstract class EditableJSONLayout implements LayoutInformationReceiver {

    @NotNull
    private String currentContent;

    @Nullable
    private String debugName;

    @Nullable
    private MutableState<Long> updateFlag;
    private int forcedWidth = Integer.MIN_VALUE;
    private int forcedHeight = Integer.MIN_VALUE;

    @NotNull
    private MotionLayoutDebugFlags forcedDrawDebug = MotionLayoutDebugFlags.UNKNOWN;

    @NotNull
    private LayoutInfoFlags layoutInformationMode = LayoutInfoFlags.BOUNDS;

    @NotNull
    private String layoutInformation = "";
    private long last = System.nanoTime();

    public EditableJSONLayout(@Language("json5") @NotNull String str) {
        this.currentContent = str;
    }

    @NotNull
    public final String getCurrentContent() {
        return this.currentContent;
    }

    @Nullable
    public final String getDebugName() {
        return this.debugName;
    }

    @NotNull
    public final MotionLayoutDebugFlags getForcedDrawDebug() {
        return this.forcedDrawDebug;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public int getForcedHeight() {
        return this.forcedHeight;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public int getForcedWidth() {
        return this.forcedWidth;
    }

    @NotNull
    public final String getLayoutInformation() {
        return this.layoutInformation;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    @NotNull
    public LayoutInfoFlags getLayoutInformationMode() {
        return this.layoutInformationMode;
    }

    public final void initialization() {
        try {
            onNewContent(this.currentContent);
            if (this.debugName != null) {
                Registry.getInstance().register(this.debugName, new RegistryCallback() { // from class: androidx.constraintlayout.compose.EditableJSONLayout$initialization$callback$1
                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    @NotNull
                    public String currentLayoutInformation() {
                        return this.this$0.layoutInformation;
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    @NotNull
                    public String currentMotionScene() {
                        return this.this$0.currentContent;
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public long getLastModified() {
                        return this.this$0.last;
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public void onDimensions(int width, int height) {
                        this.this$0.onNewDimensions(width, height);
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public void onNewMotionScene(@Nullable String content) {
                        if (content == null) {
                            return;
                        }
                        this.this$0.onNewContent(content);
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public void onProgress(float progress) {
                        this.this$0.onNewProgress(progress);
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public void setDrawDebug(int debugMode) {
                        this.this$0.onDrawDebug(debugMode);
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public void setLayoutInformationMode(int mode) {
                        this.this$0.onLayoutInformation(mode);
                    }
                });
            }
        } catch (CLParsingException unused) {
        }
    }

    public final void onDrawDebug(int debugMode) {
        if (debugMode == -1) {
            this.forcedDrawDebug = MotionLayoutDebugFlags.UNKNOWN;
        } else {
            MotionLayoutDebugFlags motionLayoutDebugFlags = MotionLayoutDebugFlags.UNKNOWN;
            if (debugMode == motionLayoutDebugFlags.ordinal()) {
                this.forcedDrawDebug = motionLayoutDebugFlags;
            } else {
                MotionLayoutDebugFlags motionLayoutDebugFlags2 = MotionLayoutDebugFlags.NONE;
                if (debugMode == motionLayoutDebugFlags2.ordinal()) {
                    this.forcedDrawDebug = motionLayoutDebugFlags2;
                } else {
                    MotionLayoutDebugFlags motionLayoutDebugFlags3 = MotionLayoutDebugFlags.SHOW_ALL;
                    if (debugMode == motionLayoutDebugFlags3.ordinal()) {
                        this.forcedDrawDebug = motionLayoutDebugFlags3;
                    }
                }
            }
        }
        signalUpdate();
    }

    public final void onLayoutInformation(int mode) {
        LayoutInfoFlags layoutInfoFlags = LayoutInfoFlags.NONE;
        if (mode == layoutInfoFlags.ordinal()) {
            this.layoutInformationMode = layoutInfoFlags;
        } else {
            LayoutInfoFlags layoutInfoFlags2 = LayoutInfoFlags.BOUNDS;
            if (mode == layoutInfoFlags2.ordinal()) {
                this.layoutInformationMode = layoutInfoFlags2;
            }
        }
        signalUpdate();
    }

    public void onNewContent(@NotNull String content) {
        CLObject objectOrNull;
        this.currentContent = content;
        try {
            CLObject cLObject = CLParser.parse(content);
            if (cLObject != null) {
                boolean z = this.debugName == null;
                if (z && (objectOrNull = cLObject.getObjectOrNull("Header")) != null) {
                    this.debugName = objectOrNull.getStringOrNull("exportAs");
                }
                if (z) {
                    return;
                }
                signalUpdate();
            }
        } catch (CLParsingException | Exception unused) {
        }
    }

    public final void onNewDimensions(int width, int height) {
        this.forcedWidth = width;
        this.forcedHeight = height;
        signalUpdate();
    }

    public void onNewProgress(float progress) {
    }

    public final void setCurrentContent(@NotNull String content) {
        this.currentContent = content;
    }

    public final void setDebugName(@Nullable String name) {
        this.debugName = name;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public void setLayoutInformation(@NotNull String information) {
        this.last = System.nanoTime();
        this.layoutInformation = information;
    }

    public final void setUpdateFlag(@NotNull MutableState<Long> needsUpdate) {
        this.updateFlag = needsUpdate;
    }

    public final void signalUpdate() {
        MutableState<Long> mutableState = this.updateFlag;
        if (mutableState != null) {
            mutableState.setValue(Long.valueOf(this.updateFlag.getValue().longValue() + 1));
        }
    }
}
