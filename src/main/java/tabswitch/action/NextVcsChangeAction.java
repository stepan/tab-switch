package tabswitch.action;

import tabswitch.filefetcher.ChangedFilesInVcsFileFetcher;

public class NextVcsChangeAction extends ChangeTabAction {

  public NextVcsChangeAction() {
    super(new ChangedFilesInVcsFileFetcher());
  }

  @Override
  protected boolean moveUp() {
    return false;
  }
}
