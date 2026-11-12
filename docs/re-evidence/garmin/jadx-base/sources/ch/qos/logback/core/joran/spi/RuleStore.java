package ch.qos.logback.core.joran.spi;

import ch.qos.logback.core.joran.action.Action;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface RuleStore {
    void addRule(ElementSelector elementSelector, Action action);

    void addRule(ElementSelector elementSelector, String str);

    List<Action> matchActions(ElementPath elementPath);
}
