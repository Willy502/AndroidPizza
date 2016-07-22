package walej.android.tipcalc.fragments;

import walej.android.tipcalc.models.TipRecord;

/**
 * Created by walej on 17/07/2016.
 */
public interface TipHistoryListFragmentListener {

    void addToList(TipRecord record);
    void clearList();

}
