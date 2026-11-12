package miuix.animation.styles;

import android.R;
import android.util.StateSet;
import miuix.animation.IStateStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DrawableStateEffect {
    private boolean mActivated;
    protected AnimState mActivatedPressedState;
    protected AnimState mActivatedState;
    private boolean mChecked;
    protected AnimState mCheckedState;
    protected boolean mEnableAnim;
    private boolean mFocused;
    protected AnimState mFocusedState;
    protected IStateStyle mFolmeState;
    private boolean mHovered;
    protected AnimState mHoveredActivatedState;
    protected AnimState mHoveredCheckedState;
    protected AnimState mHoveredPressedState;
    protected AnimState mHoveredState;
    protected AnimState mNormalState;
    private boolean mPressed;
    protected AnimState mPressedState;
    public static final int[] STATE_PRESSED = {R.attr.state_pressed};
    public static final int[] STATE_DRAG_HOVERED = {R.attr.state_drag_hovered};
    public static final int[] STATE_SELECTED = {R.attr.state_selected};
    public static final int[] STATE_SELECTED_PRESSED = {R.attr.state_selected, R.attr.state_pressed};
    public static final int[] STATE_HOVERED_ACTIVATED = {R.attr.state_hovered, R.attr.state_activated};
    public static final int[] STATE_HOVERED_SELECTED = {R.attr.state_hovered, R.attr.state_selected};
    public static final int[] STATE_HOVERED_PRESSED = {R.attr.state_hovered, R.attr.state_pressed};
    public static final int[] STATE_HOVERED = {R.attr.state_hovered};
    public static final int[] STATE_ACTIVATED = {R.attr.state_activated};
    public static final int[] STATE_ACTIVATED_PRESSED = {R.attr.state_activated, R.attr.state_pressed};
    public static final int[] STATE_CHECKED = {R.attr.state_checked};
    public static final int[] STATE_HOVERED_CHECKED = {R.attr.state_hovered, R.attr.state_checked};
    public static final int[] STATE_FOCUSED = {R.attr.state_focused};

    private boolean toActivatedPressedState() {
        boolean z = this.mPressed;
        if (z && this.mActivated) {
            return false;
        }
        if (z) {
            this.mActivated = true;
            if (this.mEnableAnim) {
                this.mFolmeState.to(this.mActivatedPressedState, getActivateEnterConfig());
            } else {
                setToActivatedPressed();
            }
            return true;
        }
        if (this.mActivated) {
            this.mPressed = true;
            if (this.mEnableAnim) {
                this.mFolmeState.to(this.mActivatedPressedState, getActivateEnterConfig());
            } else {
                setToActivatedPressed();
            }
            return true;
        }
        this.mPressed = true;
        this.mActivated = true;
        this.mHovered = false;
        this.mFocused = false;
        if (this.mEnableAnim) {
            this.mFolmeState.to(this.mActivatedPressedState, getPressEnterConfig());
        } else {
            setToActivatedPressed();
        }
        return true;
    }

    private boolean toActivatedState() {
        if (this.mPressed) {
            this.mPressed = false;
            this.mHovered = false;
            this.mActivated = true;
            if (this.mEnableAnim) {
                this.mFolmeState.to(this.mActivatedState, getPressExitConfig());
            } else {
                setToActivated();
            }
            return true;
        }
        if (this.mHovered) {
            this.mHovered = false;
            this.mActivated = true;
            if (this.mEnableAnim) {
                this.mFolmeState.to(this.mActivatedState, getHoverExitConfig());
            } else {
                setToActivated();
            }
            return true;
        }
        if (this.mActivated) {
            return false;
        }
        this.mActivated = true;
        if (this.mEnableAnim) {
            this.mFolmeState.to(this.mActivatedState, getActivateEnterConfig());
        } else {
            setToActivated();
        }
        return true;
    }

    private boolean toCheckedState() {
        if (this.mPressed) {
            this.mPressed = false;
            this.mHovered = false;
            this.mChecked = true;
            if (this.mEnableAnim) {
                this.mFolmeState.to(this.mCheckedState, getPressExitConfig());
            } else {
                setToChecked();
            }
            return true;
        }
        if (this.mHovered) {
            this.mHovered = false;
            this.mChecked = true;
            if (this.mEnableAnim) {
                this.mFolmeState.to(this.mCheckedState, getHoverExitConfig());
            } else {
                setToChecked();
            }
            return true;
        }
        if (this.mChecked) {
            return false;
        }
        this.mChecked = true;
        if (this.mEnableAnim) {
            this.mFolmeState.to(this.mCheckedState, getActivateEnterConfig());
        } else {
            setToChecked();
        }
        return true;
    }

    private boolean toFocusedState() {
        if (this.mPressed) {
            this.mPressed = false;
            this.mHovered = false;
            this.mActivated = false;
            this.mChecked = false;
            this.mFocused = true;
            if (this.mEnableAnim) {
                this.mFolmeState.to(this.mFocusedState, getPressExitConfig());
            } else {
                setToFocused();
            }
            return true;
        }
        if (this.mFocused) {
            return false;
        }
        this.mFocused = true;
        this.mActivated = false;
        this.mChecked = false;
        if (this.mEnableAnim) {
            this.mFolmeState.to(this.mFocusedState, getHoverEnterConfig());
        } else {
            setToFocused();
        }
        return true;
    }

    private boolean toHoveredActivatedState() {
        if (this.mPressed) {
            this.mPressed = false;
            this.mHovered = true;
            this.mActivated = true;
            if (this.mEnableAnim) {
                this.mFolmeState.to(this.mHoveredActivatedState, getPressExitConfig());
            } else {
                setToHoveredActivated();
            }
            return true;
        }
        boolean z = this.mHovered;
        if (z && this.mActivated) {
            return false;
        }
        if (z) {
            this.mActivated = true;
            if (this.mEnableAnim) {
                this.mFolmeState.to(this.mHoveredActivatedState, getActivateEnterConfig());
            } else {
                setToHoveredActivated();
            }
            return true;
        }
        if (this.mActivated) {
            this.mHovered = true;
            if (this.mEnableAnim) {
                this.mFolmeState.to(this.mHoveredActivatedState, getHoverEnterConfig());
            } else {
                setToHoveredActivated();
            }
            return true;
        }
        this.mActivated = true;
        this.mHovered = true;
        if (this.mEnableAnim) {
            this.mFolmeState.to(this.mHoveredActivatedState, getHoverEnterConfig());
        } else {
            setToHoveredActivated();
        }
        return true;
    }

    private boolean toHoveredCheckedState() {
        if (this.mPressed) {
            this.mPressed = false;
            this.mHovered = true;
            this.mChecked = true;
            if (this.mEnableAnim) {
                this.mFolmeState.to(this.mHoveredCheckedState, getPressExitConfig());
            } else {
                setToHoveredChecked();
            }
            return true;
        }
        boolean z = this.mHovered;
        if (z && this.mChecked) {
            return false;
        }
        if (z) {
            this.mChecked = true;
            if (this.mEnableAnim) {
                this.mFolmeState.to(this.mHoveredCheckedState, getActivateEnterConfig());
            } else {
                setToHoveredChecked();
            }
            return true;
        }
        if (this.mChecked) {
            this.mHovered = true;
            if (this.mEnableAnim) {
                this.mFolmeState.to(this.mHoveredCheckedState, getHoverEnterConfig());
            } else {
                setToHoveredChecked();
            }
            return true;
        }
        this.mChecked = true;
        this.mHovered = true;
        if (this.mEnableAnim) {
            this.mFolmeState.to(this.mHoveredCheckedState, getHoverEnterConfig());
        } else {
            setToHoveredChecked();
        }
        return true;
    }

    private boolean toHoveredPressedState() {
        boolean z = this.mHovered;
        if (z && this.mPressed) {
            return false;
        }
        if (this.mActivated) {
            this.mActivated = false;
            this.mHovered = true;
            this.mPressed = true;
            if (this.mEnableAnim) {
                this.mFolmeState.to(this.mHoveredPressedState, getHoverEnterConfig());
            } else {
                setToHoveredPressed();
            }
            return true;
        }
        if (this.mPressed) {
            this.mHovered = true;
            if (this.mEnableAnim) {
                this.mFolmeState.to(this.mHoveredPressedState, getHoverEnterConfig());
            } else {
                setToHoveredPressed();
            }
            return true;
        }
        if (z) {
            this.mPressed = true;
            if (this.mEnableAnim) {
                this.mFolmeState.to(this.mHoveredPressedState, getPressEnterConfig());
            } else {
                setToHoveredPressed();
            }
            return true;
        }
        this.mPressed = true;
        this.mHovered = true;
        if (this.mEnableAnim) {
            this.mFolmeState.to(this.mHoveredPressedState, getHoverEnterConfig());
        } else {
            setToHoveredPressed();
        }
        return true;
    }

    private boolean toHoveredState() {
        if (this.mPressed) {
            this.mPressed = false;
            this.mActivated = false;
            this.mChecked = false;
            this.mFocused = false;
            this.mHovered = true;
            if (this.mEnableAnim) {
                this.mFolmeState.to(this.mHoveredState, getPressExitConfig());
            } else {
                setToHovered();
            }
            return true;
        }
        if (this.mHovered) {
            return false;
        }
        this.mHovered = true;
        this.mActivated = false;
        this.mChecked = false;
        if (this.mEnableAnim) {
            this.mFolmeState.to(this.mHoveredState, getHoverEnterConfig());
        } else {
            setToHovered();
        }
        return true;
    }

    private boolean toNormalState() {
        if (this.mPressed) {
            this.mPressed = false;
            this.mHovered = false;
            this.mFocused = false;
            this.mActivated = false;
            this.mChecked = false;
            if (this.mEnableAnim) {
                this.mFolmeState.to(this.mNormalState, getPressExitConfig());
            } else {
                setToNormal();
            }
            return true;
        }
        if (this.mHovered) {
            this.mHovered = false;
            this.mActivated = false;
            this.mChecked = false;
            if (this.mEnableAnim) {
                this.mFolmeState.to(this.mNormalState, getHoverExitConfig());
            } else {
                setToNormal();
            }
            return true;
        }
        if (this.mFocused) {
            this.mFocused = false;
            this.mActivated = false;
            this.mChecked = false;
            if (this.mEnableAnim) {
                this.mFolmeState.to(this.mNormalState, getHoverExitConfig());
            } else {
                setToNormal();
            }
            return true;
        }
        if (this.mActivated) {
            this.mActivated = false;
            if (this.mEnableAnim) {
                this.mFolmeState.to(this.mNormalState, getActivateExitConfig());
            } else {
                setToNormal();
            }
            return true;
        }
        if (!this.mChecked) {
            return false;
        }
        this.mChecked = false;
        if (this.mEnableAnim) {
            this.mFolmeState.to(this.mNormalState, getActivateExitConfig());
        } else {
            setToNormal();
        }
        return true;
    }

    private boolean toPressedState() {
        if (this.mPressed) {
            return false;
        }
        if (this.mEnableAnim) {
            this.mFolmeState.to(this.mPressedState, getPressEnterConfig());
        } else {
            setToPressed();
        }
        this.mPressed = true;
        this.mHovered = false;
        this.mActivated = false;
        this.mFocused = false;
        return true;
    }

    public abstract AnimConfig getActivateEnterConfig();

    public abstract AnimConfig getActivateExitConfig();

    public abstract AnimConfig getHoverEnterConfig();

    public abstract AnimConfig getHoverExitConfig();

    public abstract AnimConfig getPressEnterConfig();

    public abstract AnimConfig getPressExitConfig();

    public abstract void initStates();

    public abstract void jumpToCurrentState();

    public boolean onStateChange(int[] iArr) {
        if (StateSet.stateSetMatches(STATE_ACTIVATED_PRESSED, iArr) || StateSet.stateSetMatches(STATE_SELECTED_PRESSED, iArr)) {
            return toActivatedPressedState();
        }
        if (StateSet.stateSetMatches(STATE_PRESSED, iArr) || StateSet.stateSetMatches(STATE_DRAG_HOVERED, iArr) || StateSet.stateSetMatches(STATE_SELECTED, iArr)) {
            return toPressedState();
        }
        if (StateSet.stateSetMatches(STATE_FOCUSED, iArr)) {
            return toFocusedState();
        }
        if (StateSet.stateSetMatches(STATE_HOVERED_ACTIVATED, iArr) || StateSet.stateSetMatches(STATE_HOVERED_SELECTED, iArr)) {
            return toHoveredActivatedState();
        }
        if (StateSet.stateSetMatches(STATE_HOVERED_PRESSED, iArr)) {
            return toHoveredPressedState();
        }
        if (StateSet.stateSetMatches(STATE_HOVERED_CHECKED, iArr)) {
            return toHoveredCheckedState();
        }
        if (StateSet.stateSetMatches(STATE_HOVERED, iArr)) {
            return toHoveredState();
        }
        if (StateSet.stateSetMatches(STATE_ACTIVATED, iArr)) {
            return toActivatedState();
        }
        return StateSet.stateSetMatches(STATE_CHECKED, iArr) ? toCheckedState() : toNormalState();
    }

    public void setEnableAnim(boolean z) {
        this.mEnableAnim = z;
    }

    public abstract void setToActivated();

    public abstract void setToActivatedPressed();

    public abstract void setToChecked();

    public abstract void setToCheckedPressed();

    public abstract void setToFocused();

    public abstract void setToFocusedPressed();

    public abstract void setToHovered();

    public abstract void setToHoveredActivated();

    public abstract void setToHoveredChecked();

    public abstract void setToHoveredPressed();

    public abstract void setToNormal();

    public abstract void setToPressed();
}
